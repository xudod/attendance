package com.xudod.attendance.schedule_code.domain.service;

import com.xudod.attendance.schedule_code.domain.entity.bo.ScheduleBo;
import com.xudod.attendance.schedule_code.domain.entity.po.ScheduleCode;
import com.xudod.attendance.schedule_code.domain.entity.po.ScheduleTime;
import com.xudod.attendance.schedule_code.domain.mapper.ScheduleCodeMapper;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import java.util.List;
import org.slf4j.LoggerFactory;
import com.xudod.attendance.common.BusinessException;
import com.xudod.attendance.common.GenId;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.DataCorrectCheck;
import com.xudod.attendance.common.PageParameter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 *
 * Created by xudod on 2020/04/27.
 */
@Service("scheduleCodeService")
@Transactional(rollbackFor=Exception.class)
public class ScheduleCodeImp implements ScheduleCodeService {

	@Value("${snowid.workerId}")
	private long workerId;
	
	@Value("${snowid.datacenterId}")
	private long datacenterId;
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
    private ScheduleCodeMapper scheduleCodeMapper;
	
	@Autowired
	private ScheduleTimeService scheduleTimeService;
    
    private Logger logger= LoggerFactory.getLogger(ScheduleCodeImp.class);
    
    /*代码分界head TODO*/

	
	@Override
	public Integer add(ScheduleBo po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "新增数据时，检测到数据实体为null，保存失败！");
			ScheduleCode scheduleCode = new ScheduleCode();
			BeanUtils.copyProperties(po, scheduleCode);
			if(null == scheduleCode.getId() || "".equals(scheduleCode.getId())) {
				scheduleCode.setId(GenId.getUUID(workerId, datacenterId));
			}
			scheduleCode.setCreateBy(null != request.getHeader("userid") ? request.getHeader("userid") : "");
			scheduleCode.setSequence(scheduleCodeMapper.getSequence("schedule_code"));
			int res = scheduleCodeMapper.insert(scheduleCode);
			addUpDelResCheck(res, "添加数据失败！");
			addScheduleTime(po);
			return res;
		} catch (Exception e) {
			throw e;
		}
	}

	private void addScheduleTime(ScheduleBo po) {
		List<ScheduleTime> scheduleTimeList = po.getScheduleTimeList();
		if(null != scheduleTimeList && scheduleTimeList.size() > 0) {
			for (ScheduleTime scheduleTime : scheduleTimeList) {
				scheduleTime.setScheduleCode(po.getScheduleCode());
				Integer add = scheduleTimeService.add(scheduleTime);
				addUpDelResCheck(add, "添加数据子数据失败！");
			}
		}
	}
	
	@Override
	public Integer delbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "删除数据时，检测到id字符串值为null，删除失败！");
			int res = scheduleCodeMapper.deleteById(id);
			addUpDelResCheck(res, "删除数据失败！");
			ScheduleBo getbykey = getbykey(id);
			Integer delbyPid = scheduleTimeService.delbyScheduleCode(getbykey.getScheduleCode());
			addUpDelResCheck(delbyPid, "删除数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer upbykey(ScheduleBo po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "更新数据时，检测到数据实体为null，更新失败！");
			ScheduleCode scheduleCode = new ScheduleCode();
			BeanUtils.copyProperties(po, scheduleCode);
			scheduleCode.setModifyBy(request.getHeader("userid"));
			int res = scheduleCodeMapper.updateById(scheduleCode);
			addUpDelResCheck(res, "更新数据失败！");
			Integer delbyPid = scheduleTimeService.delbyScheduleCode(po.getScheduleCode());
			addUpDelResCheck(delbyPid, "删除数据失败！");
			addScheduleTime(po);
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public ScheduleBo getbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "查询数据时，检测到查询id为null，查询失败！");
			ScheduleCode po = scheduleCodeMapper.selectById(id);
			ScheduleBo scheduleBo = new ScheduleBo();
			BeanUtils.copyProperties(po, scheduleBo);
			List<ScheduleTime> scheduleTimeList = scheduleTimeService.getbyScheduleCode(scheduleBo.getScheduleCode());
			scheduleBo.setScheduleTimeList(scheduleTimeList);
			return scheduleBo;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public IPage<ScheduleCode> getpage(PageParameter<ScheduleCode> page) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(page, "查询数据时，检测到分页对象为null，查询失败！");
			Page<ScheduleCode> ipage = new Page<ScheduleCode>();
			BeanUtils.copyProperties(page, ipage);
	        IPage<ScheduleCode> orgIPage = scheduleCodeMapper.selectPage(ipage, new QueryWrapper<ScheduleCode>());
	        return orgIPage;
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public Integer upStatebykey(UpStateVo upStateVo) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(upStateVo, "更新数据时，检测到数据实体为null，更新失败！");
			String header = null != request.getHeader("userid") ? request.getHeader("userid") : "reqHeaderNull";
			int res = scheduleCodeMapper.upStatebykey(upStateVo.getId(), upStateVo.getStatus(), header);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public List<ScheduleCode> getAll() {
		List<ScheduleCode> res = scheduleCodeMapper.getAll();
		return res;
	}
	
	private void addUpDelResCheck(int res, String msg){
		if(res < 1){
			throw new BusinessException(res, msg);
		}
	}
	
	/*代码分界end TODO*/


	
}

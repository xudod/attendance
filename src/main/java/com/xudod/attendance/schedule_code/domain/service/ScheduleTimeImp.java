package com.xudod.attendance.schedule_code.domain.service;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;
import com.xudod.attendance.common.BusinessException;
import com.xudod.attendance.common.GenId;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.schedule_code.domain.entity.po.ScheduleTime;
import com.xudod.attendance.schedule_code.domain.mapper.ScheduleTimeMapper;
import com.xudod.attendance.common.DataCorrectCheck;
import com.xudod.attendance.common.PageParameter;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 *
 * Created by xudod on 2020/04/27.
 */
@Service("scheduleTimeService")
public class ScheduleTimeImp implements ScheduleTimeService {

	@Value("${snowid.workerId}")
	private long workerId;
	
	@Value("${snowid.datacenterId}")
	private long datacenterId;
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
    private ScheduleTimeMapper scheduleTimeMapper;
    
    private Logger logger= LoggerFactory.getLogger(ScheduleTimeImp.class);
    
    /*代码分界head TODO*/

	
	@Override
	public Integer add(ScheduleTime po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "新增数据时，检测到数据实体为null，保存失败！");
			if(null == po.getId() || "".equals(po.getId())) {
				po.setId(GenId.getUUID(workerId, datacenterId));
			}
			po.setCreateBy(null != request.getHeader("userid") ? request.getHeader("userid") : "");
			po.setSequence(scheduleTimeMapper.getSequence("schedule_time"));
			int res = scheduleTimeMapper.insert(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer delbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "删除数据时，检测到id字符串值为null，删除失败！");
			int res = scheduleTimeMapper.deleteById(id);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer upbykey(ScheduleTime po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "更新数据时，检测到数据实体为null，更新失败！");
			po.setModifyBy(request.getHeader("userid"));
			int res = scheduleTimeMapper.updateById(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public ScheduleTime getbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "查询数据时，检测到查询id为null，查询失败！");
			ScheduleTime po = scheduleTimeMapper.selectById(id);
			return po;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public IPage<ScheduleTime> getpage(PageParameter<ScheduleTime> page) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(page, "查询数据时，检测到分页对象为null，查询失败！");
			Page<ScheduleTime> ipage = new Page<ScheduleTime>();
			BeanUtils.copyProperties(page, ipage);
	        IPage<ScheduleTime> orgIPage = scheduleTimeMapper.selectPage(ipage, new QueryWrapper<ScheduleTime>());
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
			int res = scheduleTimeMapper.upStatebykey(upStateVo.getId(), upStateVo.getStatus(), header);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public List<ScheduleTime> getAll() {
		List<ScheduleTime> res = scheduleTimeMapper.getAll();
		return res;
	}
	
	private void addUpDelResCheck(int res, String msg){
		if(res < 1){
			throw new BusinessException(res, msg);
		}
	}
	/*代码分界end TODO*/
	
	@Override
	public Integer delbyScheduleCode(String code) {
		Map<String, Object> columnMap = new HashMap<String, Object>();
		columnMap.put("schedule_code", code);
		int deleteByMap = scheduleTimeMapper.deleteByMap(columnMap);
		return deleteByMap;
	}

	@Override
	public List<ScheduleTime> getbyScheduleCode(String code) {
		QueryWrapper<ScheduleTime> quWrapper = new QueryWrapper<ScheduleTime>();
		quWrapper.eq("schedule_code", code).orderByAsc("att_seqence");
		List<ScheduleTime> selectByMap = scheduleTimeMapper.selectList(quWrapper);
		return selectByMap;
	}
	


	
}

package com.xudod.attendance.emp_attendance_status.domain.service;

import com.xudod.attendance.emp_attendance_status.domain.entity.bo.UserScheduleSearchChildVo;
import com.xudod.attendance.emp_attendance_status.domain.entity.bo.UserScheduleSearchVo;
import com.xudod.attendance.emp_attendance_status.domain.entity.po.EmpAttendanceStatus;
import com.xudod.attendance.emp_attendance_status.domain.feign.user_att_app_info.UserAttAppInfoFeignInf;
import com.xudod.attendance.emp_attendance_status.domain.mapper.EmpAttendanceStatusMapper;
import com.xudod.attendance.emp_attendance_status.interfaces.so.UserScheduleSearchParam;
import com.xudod.attendance.emp_attendance_status.interfaces.vo.UserScheduleResVo;
import com.xudod.attendance.user_att_app_info.domain.entity.po.UserAttAppInfo;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.LoggerFactory;
import com.xudod.attendance.common.BusinessException;
import com.xudod.attendance.common.GenId;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.DataCorrectCheck;
import com.xudod.attendance.common.DateUtil;
import com.xudod.attendance.common.PageParameter;
import org.springframework.stereotype.Service;
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
@Service("empAttendanceStatusService")
public class EmpAttendanceStatusImp implements EmpAttendanceStatusService {

	@Value("${snowid.workerId}")
	private long workerId;
	
	@Value("${snowid.datacenterId}")
	private long datacenterId;
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
    private EmpAttendanceStatusMapper empAttendanceStatusMapper;
	
	@Autowired
	private UserAttAppInfoFeignInf userAttAppInfoFeignInf;
    
    private Logger logger= LoggerFactory.getLogger(EmpAttendanceStatusImp.class);
    
    /*代码分界head TODO*/

	
	@Override
	public Integer add(EmpAttendanceStatus po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "新增数据时，检测到数据实体为null，保存失败！");
			if(null == po.getId() || "".equals(po.getId())) {
				po.setId(GenId.getUUID(workerId, datacenterId));
			}
			po.setCreateBy(null != request.getHeader("userid") ? request.getHeader("userid") : "");
			po.setSequence(empAttendanceStatusMapper.getSequence("emp_attendance_status"));
			int res = empAttendanceStatusMapper.insert(po);
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
			int res = empAttendanceStatusMapper.deleteById(id);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer upbykey(EmpAttendanceStatus po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "更新数据时，检测到数据实体为null，更新失败！");
			po.setModifyBy(request.getHeader("userid"));
			int res = empAttendanceStatusMapper.updateById(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public EmpAttendanceStatus getbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "查询数据时，检测到查询id为null，查询失败！");
			EmpAttendanceStatus po = empAttendanceStatusMapper.selectById(id);
			return po;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public IPage<EmpAttendanceStatus> getpage(PageParameter<EmpAttendanceStatus> page) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(page, "查询数据时，检测到分页对象为null，查询失败！");
			Page<EmpAttendanceStatus> ipage = new Page<EmpAttendanceStatus>();
			BeanUtils.copyProperties(page, ipage);
	        IPage<EmpAttendanceStatus> orgIPage = empAttendanceStatusMapper.selectPage(ipage, new QueryWrapper<EmpAttendanceStatus>());
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
			int res = empAttendanceStatusMapper.upStatebykey(upStateVo.getId(), upStateVo.getStatus(), header);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public List<EmpAttendanceStatus> getAll() {
		List<EmpAttendanceStatus> res = empAttendanceStatusMapper.getAll();
		return res;
	}
	
	private void addUpDelResCheck(int res, String msg){
		if(res < 1){
			throw new BusinessException(res, msg);
		}
	}
	
	/*代码分界end TODO*/
	
	@SuppressWarnings("unchecked")
	@Override
	public UserScheduleResVo getuserschedule(UserScheduleSearchParam userScheduleSearchParam) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(userScheduleSearchParam, "查询数据时，检测到数据实体为null，查询失败！");
			//先处理返回实体类
			//获取成员，再获取成员的排班
			List<UserAttAppInfo> userAll = (List<UserAttAppInfo>) userAttAppInfoFeignInf.getall().getData();
			Date startDate = DateUtil.toDate(userScheduleSearchParam.getStartDate());
			Date endDate = DateUtil.toDate(userScheduleSearchParam.getEndDate());
			HashMap<String, Object> hashMap = new HashMap<String, Object>();
			hashMap.put("startDate", startDate);
			hashMap.put("endDate", endDate);
			
			//先不采用这种方式List<EmpAttendanceStatus> res = empAttendanceStatusMapper.getUserSchedule(startDate, endDate);
			//根据日期区间生成日期string list
			String startDateStr = userScheduleSearchParam.getStartDate();
			List<String> dateList = new ArrayList<String>();
			dateList.add(startDateStr);
			while(endDate.compareTo(startDate) > 0) {
				startDate = DateUtil.addDays(startDate, 1);
				String string = DateUtil.toString(startDate, "yyyy-MM-dd");
				dateList.add(string);
			}
			hashMap.put("userAll", userAll);
			hashMap.put("dateList", dateList);
			List<UserScheduleSearchVo> res = empAttendanceStatusMapper.getUserScheduleByDateArea(hashMap);
			List<HashMap<String, Object>> arrayList = new ArrayList<HashMap<String, Object>>();
			for (UserScheduleSearchVo a : res) {
				HashMap<String, Object> resMap = new HashMap<String, Object>();
				resMap.put("userName", a.getUserName());
				resMap.put("empMdmCode", a.getEmpMdmCode());
				List<UserScheduleSearchChildVo> userScheduleSearchChildVoList = a.getUserScheduleSearchChildVoList();
				for (UserScheduleSearchChildVo b : userScheduleSearchChildVoList) {
					resMap.put(b.getDay(), b);
				}
				arrayList.add(resMap);
			}
			UserScheduleResVo userScheduleResVo = new UserScheduleResVo(dateList, arrayList);
			return userScheduleResVo;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public String schedulebatchadd(List<EmpAttendanceStatus> empAttendanceStatusList) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(empAttendanceStatusList, "保存数据时，检测到数据实体为null，保存失败！");
			List<String> idStr=  empAttendanceStatusList.stream().map(EmpAttendanceStatus::getId).collect(Collectors.toList());
			empAttendanceStatusMapper.schedulebatchdel(idStr);
			empAttendanceStatusMapper.schedulebatchadd(empAttendanceStatusList);
			return "保存成功！";
		} catch (Exception e) {
			throw e;
		}
	}


	
}

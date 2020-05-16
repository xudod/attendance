package com.xudod.attendance.schedule_code.domain.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.common.BusinessException;
import com.xudod.attendance.common.DataCorrectCheck;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.schedule_code.domain.entity.po.ScheduleTime;

import java.util.List;


/**
 *
 * Created by xudod on 2020/04/27.
 */
public interface ScheduleTimeService {
    
    /*代码分界head TODO*/


	Integer add(ScheduleTime pojo);

	Integer delbykey(String id);

	Integer upbykey(ScheduleTime pojo);

	ScheduleTime getbykey(String id);
	
	IPage<ScheduleTime> getpage(PageParameter<ScheduleTime> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<ScheduleTime> getAll();

	/*代码分界end TODO*/
	
	Integer delbyScheduleCode(String id);

	List<ScheduleTime> getbyScheduleCode(String code);


}

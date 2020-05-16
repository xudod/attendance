package com.xudod.attendance.schedule_code.domain.service;

import com.xudod.attendance.schedule_code.domain.entity.bo.ScheduleBo;
import com.xudod.attendance.schedule_code.domain.entity.po.ScheduleCode;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.common.BusinessException;
import com.xudod.attendance.common.DataCorrectCheck;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.common.UpStateVo;
import java.util.List;


/**
 *
 * Created by xudod on 2020/04/27.
 */
public interface ScheduleCodeService {
    
    /*代码分界head TODO*/


	Integer add(ScheduleBo pojo);

	Integer delbykey(String id);

	Integer upbykey(ScheduleBo pojo);

	ScheduleBo getbykey(String id);
	
	IPage<ScheduleCode> getpage(PageParameter<ScheduleCode> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<ScheduleCode> getAll();

	/*代码分界end TODO*/


}

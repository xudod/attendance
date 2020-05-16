package com.xudod.attendance.user_schedule.domain.service;

import com.xudod.attendance.user_schedule.domain.entity.po.UserSchedule;
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
public interface UserScheduleService {
    
    /*代码分界head TODO*/


	Integer add(UserSchedule pojo);

	Integer delbykey(String id);

	Integer upbykey(UserSchedule pojo);

	UserSchedule getbykey(String id);
	
	IPage<UserSchedule> getpage(PageParameter<UserSchedule> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<UserSchedule> getAll();

	/*代码分界end TODO*/


}

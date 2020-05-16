package com.xudod.attendance.user_schedule_change.domain.service;

import com.xudod.attendance.user_schedule_change.domain.entity.po.UserScheduleChange;
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
public interface UserScheduleChangeService {
    
    /*代码分界head TODO*/


	Integer add(UserScheduleChange pojo);

	Integer delbykey(String id);

	Integer upbykey(UserScheduleChange pojo);

	UserScheduleChange getbykey(String id);
	
	IPage<UserScheduleChange> getpage(PageParameter<UserScheduleChange> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<UserScheduleChange> getAll();

	/*代码分界end TODO*/


}

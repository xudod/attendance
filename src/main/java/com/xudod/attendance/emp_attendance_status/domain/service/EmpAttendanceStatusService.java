package com.xudod.attendance.emp_attendance_status.domain.service;

import com.xudod.attendance.emp_attendance_status.domain.entity.po.EmpAttendanceStatus;
import com.xudod.attendance.emp_attendance_status.interfaces.so.UserScheduleSearchParam;
import com.xudod.attendance.emp_attendance_status.interfaces.vo.UserScheduleResVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.common.UpStateVo;
import java.util.List;


/**
 *
 * Created by xudod on 2020/04/27.
 */
public interface EmpAttendanceStatusService {
    
    /*代码分界head TODO*/


	Integer add(EmpAttendanceStatus pojo);

	Integer delbykey(String id);

	Integer upbykey(EmpAttendanceStatus pojo);

	EmpAttendanceStatus getbykey(String id);
	
	IPage<EmpAttendanceStatus> getpage(PageParameter<EmpAttendanceStatus> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<EmpAttendanceStatus> getAll();

	/*代码分界end TODO*/
	
	UserScheduleResVo getuserschedule(UserScheduleSearchParam userScheduleSearchParam);

	String schedulebatchadd(List<EmpAttendanceStatus> empAttendanceStatusList);


}

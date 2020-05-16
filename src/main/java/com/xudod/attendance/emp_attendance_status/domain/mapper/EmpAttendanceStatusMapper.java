package com.xudod.attendance.emp_attendance_status.domain.mapper;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.emp_attendance_status.domain.entity.bo.UserScheduleSearchVo;
import com.xudod.attendance.emp_attendance_status.domain.entity.po.EmpAttendanceStatus;

/**
 * 考勤状态展示
 * Created by xudod on 2020/04/27.
 */
public interface EmpAttendanceStatusMapper extends BaseMapper<EmpAttendanceStatus> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update emp_attendance_status set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from emp_attendance_status where deleted = '0'")
	List<EmpAttendanceStatus> getAll();

	/*代码分界end TODO*/
	
	List<EmpAttendanceStatus> getUserSchedule(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

//	List<UserScheduleSearchRes> getUserSchedule(List<String> dateList, Object data);

	List<UserScheduleSearchVo> getUserScheduleByDateArea(@Param("hashMap") HashMap<String, Object> hashMap);

	void schedulebatchadd(@Param("empAttendanceStatusList") List<EmpAttendanceStatus> empAttendanceStatusList);

	void schedulebatchdel(@Param("idStr") List<String> idStr);


}

package com.xudod.attendance.emp_attendance_add.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.emp_attendance_add.domain.entity.po.EmpAttendanceAdd;

/**
 * 员工补考勤表，，数据从bpm来
 * Created by xudod on 2020/04/27.
 */
public interface EmpAttendanceAddMapper extends BaseMapper<EmpAttendanceAdd> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update emp_attendance_add set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from emp_attendance_add where deleted = '0'")
	List<EmpAttendanceAdd> getAll();

	/*代码分界end TODO*/


}

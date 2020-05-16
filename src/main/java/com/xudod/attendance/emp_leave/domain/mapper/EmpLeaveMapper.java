package com.xudod.attendance.emp_leave.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.emp_leave.domain.entity.po.EmpLeave;

/**
 * 员工请假表，数据从bpm来
 * Created by xudod on 2020/04/27.
 */
public interface EmpLeaveMapper extends BaseMapper<EmpLeave> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update emp_leave set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from emp_leave where deleted = '0'")
	List<EmpLeave> getAll();

	/*代码分界end TODO*/


}

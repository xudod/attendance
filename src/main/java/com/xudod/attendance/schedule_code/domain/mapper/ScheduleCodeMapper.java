package com.xudod.attendance.schedule_code.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.schedule_code.domain.entity.po.ScheduleCode;

/**
 * 员工排班编码表，这个表和排班时间表，一旦使用，则不可编辑
 * Created by xudod on 2020/04/27.
 */
public interface ScheduleCodeMapper extends BaseMapper<ScheduleCode> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update schedule_code set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from schedule_code where deleted = '0'")
	List<ScheduleCode> getAll();

	/*代码分界end TODO*/


}

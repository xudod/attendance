package com.xudod.attendance.user_schedule.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.user_schedule.domain.entity.po.UserSchedule;

/**
 * 人员排班信息，排班对应的任何处理，对应的都是排班的时间，而不是自然天周而复始的时间。当schedule_change_id为有值，则使用该id。计算过的排班时间信息由单独的服务处理完后，存入数据库后，再存在redis中，
 * Created by xudod on 2020/04/27.
 */
public interface UserScheduleMapper extends BaseMapper<UserSchedule> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update user_schedule set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from user_schedule where deleted = '0'")
	List<UserSchedule> getAll();

	/*代码分界end TODO*/


}

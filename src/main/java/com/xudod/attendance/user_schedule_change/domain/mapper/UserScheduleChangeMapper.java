package com.xudod.attendance.user_schedule_change.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.user_schedule_change.domain.entity.po.UserScheduleChange;

/**
 * 成员排班时间发生变化后时间存储表，影响该表数据的原因数据比如请假数据等，用关系表关联
 * Created by xudod on 2020/04/27.
 */
public interface UserScheduleChangeMapper extends BaseMapper<UserScheduleChange> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update user_schedule_change set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from user_schedule_change where deleted = '0'")
	List<UserScheduleChange> getAll();

	/*代码分界end TODO*/


}

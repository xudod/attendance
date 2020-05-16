package com.xudod.attendance.user_org_relation.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.user_org_relation.domain.entity.po.UserOrgRelation;

/**
 * 人员和组织机构关系
 * Created by xudod on 2020/04/27.
 */
public interface UserOrgRelationMapper extends BaseMapper<UserOrgRelation> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update user_org_relation set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from user_org_relation where deleted = '0'")
	List<UserOrgRelation> getAll();

	/*代码分界end TODO*/


}

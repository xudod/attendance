package com.xudod.attendance.org_indeustry_relation.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.org_indeustry_relation.domain.entity.po.OrgIndeustryRelation;

/**
 * 组织结构和行业的关系表
 * Created by xudod on 2020/04/27.
 */
public interface OrgIndeustryRelationMapper extends BaseMapper<OrgIndeustryRelation> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update org_indeustry_relation set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from org_indeustry_relation where deleted = '0'")
	List<OrgIndeustryRelation> getAll();

	/*代码分界end TODO*/


}

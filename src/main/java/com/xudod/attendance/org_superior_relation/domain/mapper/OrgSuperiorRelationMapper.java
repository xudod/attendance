package com.xudod.attendance.org_superior_relation.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.org_superior_relation.domain.entity.po.OrgSuperiorRelation;

/**
 * 组织结构和其上级的关系表
 * Created by xudod on 2020/04/27.
 */
public interface OrgSuperiorRelationMapper extends BaseMapper<OrgSuperiorRelation> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update org_superior_relation set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from org_superior_relation where deleted = '0'")
	List<OrgSuperiorRelation> getAll();

	/*代码分界end TODO*/


}

package com.xudod.attendance.org.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.org.domain.entity.po.Org;

/**
 * 组织机构表，来源于主数据
 * Created by xudod on 2020/04/27.
 */
public interface OrgMapper extends BaseMapper<Org> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update org set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from org where deleted = '0'")
	List<Org> getAll();

	/*代码分界end TODO*/
	
//	@Select("select * from org where superior_code = #{superior_code, jdbcType=VARCHAR} and org_type = #{org_type, jdbcType=VARCHAR} and deleted = '0'")
//	List<Org> getOrgListByPid(@Param("superior_code") String superior_code, @Param("org_type") String org_type);

	@Select("select * from org where mdm_code = #{mdm_code, jdbcType=VARCHAR} and deleted = '0'")
	Org getByMdmCode(@Param("mdm_code") String mdm_code);

	@Select("select mdm_code, name, superior_code from org where deleted = '0'")
	List<Org> getAllOlnyTreeNeedColumn();


}

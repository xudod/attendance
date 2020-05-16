package com.xudod.attendance.fun_resource.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.fun_resource.domain.entity.po.FunResource;
import com.xudod.attendance.fun_resource.interfaces.vo.FunResourceTreeVo;

/**
 * 权限功能资源
 * Created by xudod on 2020/04/27.
 */
public interface FunResourceMapper extends BaseMapper<FunResource> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update fun_resource set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from fun_resource where deleted = '0'")
	List<FunResource> getAll();

	/*代码分界end TODO*/

	@Select("select id, show_name_cn, code, url, pid from fun_resource where belong_sys = #{code, jdbcType=VARCHAR} and (type = 'MENU_ONE' or type = 'MENU_TWO') and deleted = '0'")
	List<FunResource> getAllOnlyMenu(@Param("code") String code);

}

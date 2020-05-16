package com.xudod.attendance.app_sysinfo_mdata.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.app_sysinfo_mdata.domain.entity.po.AppSysinfoMdata;

/**
 * 系统信息管理
 * Created by xudod on 2020/04/27.
 */
public interface AppSysinfoMdataMapper extends BaseMapper<AppSysinfoMdata> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update app_sysinfo_mdata set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from app_sysinfo_mdata where deleted = '0'")
	List<AppSysinfoMdata> getAll();

	/*代码分界end TODO*/


}

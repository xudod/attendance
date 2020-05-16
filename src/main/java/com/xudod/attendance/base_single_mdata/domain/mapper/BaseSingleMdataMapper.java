package com.xudod.attendance.base_single_mdata.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.base_single_mdata.domain.entity.po.BaseSingleMdata;

/**
 * 单键值码表数据
 * Created by xudod on 2020/04/27.
 */
public interface BaseSingleMdataMapper extends BaseMapper<BaseSingleMdata> {

	/*代码分界head TODO*/
	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update base_single_mdata set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from base_single_mdata where deleted = '0'")
	List<BaseSingleMdata> getAll();

	/*代码分界end TODO*/
	
	@Select("select * from base_single_mdata where code = #{code, jdbcType=VARCHAR} and deleted = '0'")
	BaseSingleMdata getbycode(@Param("code") String code);


}

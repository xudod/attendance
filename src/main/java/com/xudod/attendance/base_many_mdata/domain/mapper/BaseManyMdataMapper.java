package com.xudod.attendance.base_many_mdata.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.base_many_mdata.domain.entity.po.BaseManyMdata;

/**
 * 多键值码表数据
 * Created by xudod on 2020/04/27.
 */
public interface BaseManyMdataMapper extends BaseMapper<BaseManyMdata> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update base_many_mdata set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from base_many_mdata where deleted = '0'")
	List<BaseManyMdata> getAll();

	/*代码分界end TODO*/

	@Select("select * from base_many_mdata where group_code = #{group_code, jdbcType=VARCHAR} and deleted = '0'")
	List<BaseManyMdata> getmanymdata(@Param("group_code") String group_code);

}

package com.xudod.attendance.wifi_info.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.wifi_info.domain.entity.po.WifiInfo;

/**
 * wifi设备信息
 * Created by xudod on 2020/04/27.
 */
public interface WifiInfoMapper extends BaseMapper<WifiInfo> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update wifi_info set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from wifi_info where deleted = '0'")
	List<WifiInfo> getAll();

	/*代码分界end TODO*/


}

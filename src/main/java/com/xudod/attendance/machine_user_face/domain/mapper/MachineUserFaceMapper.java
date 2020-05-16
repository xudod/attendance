package com.xudod.attendance.machine_user_face.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.machine_user_face.domain.entity.po.MachineUserFace;

/**
 * 数据库中没有表的备注，请添加
 * Created by xudod on 2020/04/27.
 */
public interface MachineUserFaceMapper extends BaseMapper<MachineUserFace> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update machine_user_face set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from machine_user_face where deleted = '0'")
	List<MachineUserFace> getAll();

	/*代码分界end TODO*/


}

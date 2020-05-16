package com.xudod.attendance.att_confirm_rec.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.att_confirm_rec.domain.entity.po.AttConfirmRec;

/**
 * 该表考勤数据在人员确认考勤时，其数据与报表是一致的。因为要记录确认考勤当时的状态，所以，要留一个备份。
 * Created by xudod on 2020/04/27.
 */
public interface AttConfirmRecMapper extends BaseMapper<AttConfirmRec> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update att_confirm_rec set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from att_confirm_rec where deleted = '0'")
	List<AttConfirmRec> getAll();

	/*代码分界end TODO*/


}

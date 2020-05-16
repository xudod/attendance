package com.xudod.attendance.all_punch_record.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.all_punch_record.domain.entity.po.AllPunchRecord;

/**
 * 打卡数据保存管理
 * Created by xudod on 2020/04/27.
 */
public interface AllPunchRecordMapper extends BaseMapper<AllPunchRecord> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update all_punch_record set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from all_punch_record where deleted = '0'")
	List<AllPunchRecord> getAll();

	/*代码分界end TODO*/


}

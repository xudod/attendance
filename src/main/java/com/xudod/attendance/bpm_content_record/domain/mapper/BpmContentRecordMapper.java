package com.xudod.attendance.bpm_content_record.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.bpm_content_record.domain.entity.po.BpmContentRecord;

/**
 * bpm流程记录
 * Created by xudod on 2020/04/27.
 */
public interface BpmContentRecordMapper extends BaseMapper<BpmContentRecord> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update bpm_content_record set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from bpm_content_record where deleted = '0'")
	List<BpmContentRecord> getAll();

	/*代码分界end TODO*/


}

package com.xudod.attendance.holiday_and_spell.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xudod.attendance.holiday_and_spell.domain.entity.po.HolidayAndSpell;

/**
 * 国家法定节假日和调班信息表
 * Created by xudod on 2020/04/27.
 */
public interface HolidayAndSpellMapper extends BaseMapper<HolidayAndSpell> {

	/*代码分界head TODO*/

	
	@Select("select nextval(#{tableName, jdbcType=VARCHAR})")
	Integer getSequence(@Param("tableName") String tableName);
	
	@Update("update holiday_and_spell set status = #{status, jdbcType=VARCHAR}, modify_by = #{modifyBy, jdbcType=VARCHAR} where id = #{id, jdbcType=VARCHAR}")
	int upStatebykey(@Param("id") String id, @Param("status") String status, @Param("modifyBy") String modifyBy);
	
	@Select("select * from holiday_and_spell where deleted = '0'")
	List<HolidayAndSpell> getAll();

	/*代码分界end TODO*/


}

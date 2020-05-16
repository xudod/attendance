package com.xudod.attendance.holiday_and_spell.domain.service;

import com.xudod.attendance.holiday_and_spell.domain.entity.po.HolidayAndSpell;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.common.BusinessException;
import com.xudod.attendance.common.DataCorrectCheck;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.common.UpStateVo;
import java.util.List;


/**
 *
 * Created by xudod on 2020/04/27.
 */
public interface HolidayAndSpellService {
    
    /*代码分界head TODO*/


	Integer add(HolidayAndSpell pojo);

	Integer delbykey(String id);

	Integer upbykey(HolidayAndSpell pojo);

	HolidayAndSpell getbykey(String id);
	
	IPage<HolidayAndSpell> getpage(PageParameter<HolidayAndSpell> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<HolidayAndSpell> getAll();

	/*代码分界end TODO*/


}

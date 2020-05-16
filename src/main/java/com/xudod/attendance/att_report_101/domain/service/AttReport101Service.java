package com.xudod.attendance.att_report_101.domain.service;

import com.xudod.attendance.att_report_101.domain.entity.po.AttReport101;
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
public interface AttReport101Service {
    
    /*代码分界head TODO*/


	Integer add(AttReport101 pojo);

	Integer delbykey(String id);

	Integer upbykey(AttReport101 pojo);

	AttReport101 getbykey(String id);
	
	IPage<AttReport101> getpage(PageParameter<AttReport101> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<AttReport101> getAll();

	/*代码分界end TODO*/


}

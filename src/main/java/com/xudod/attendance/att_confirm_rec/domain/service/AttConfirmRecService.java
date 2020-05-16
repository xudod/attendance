package com.xudod.attendance.att_confirm_rec.domain.service;

import com.xudod.attendance.att_confirm_rec.domain.entity.po.AttConfirmRec;
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
public interface AttConfirmRecService {
    
    /*代码分界head TODO*/


	Integer add(AttConfirmRec pojo);

	Integer delbykey(String id);

	Integer upbykey(AttConfirmRec pojo);

	AttConfirmRec getbykey(String id);
	
	IPage<AttConfirmRec> getpage(PageParameter<AttConfirmRec> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<AttConfirmRec> getAll();

	/*代码分界end TODO*/


}

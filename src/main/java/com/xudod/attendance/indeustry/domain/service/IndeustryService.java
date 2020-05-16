package com.xudod.attendance.indeustry.domain.service;

import com.xudod.attendance.indeustry.domain.entity.po.Indeustry;
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
public interface IndeustryService {
    
    /*代码分界head TODO*/


	Integer add(Indeustry pojo);

	Integer delbykey(String id);

	Integer upbykey(Indeustry pojo);

	Indeustry getbykey(String id);
	
	IPage<Indeustry> getpage(PageParameter<Indeustry> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<Indeustry> getAll();

	/*代码分界end TODO*/


}

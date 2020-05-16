package com.xudod.attendance.produce.domain.service;

import com.xudod.attendance.produce.domain.entity.po.Produce;
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
public interface ProduceService {
    
    /*代码分界head TODO*/


	Integer add(Produce pojo);

	Integer delbykey(String id);

	Integer upbykey(Produce pojo);

	Produce getbykey(String id);
	
	IPage<Produce> getpage(PageParameter<Produce> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<Produce> getAll();

	/*代码分界end TODO*/


}

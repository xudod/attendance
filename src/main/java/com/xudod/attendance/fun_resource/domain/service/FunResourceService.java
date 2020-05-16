package com.xudod.attendance.fun_resource.domain.service;

import com.xudod.attendance.fun_resource.domain.entity.po.FunResource;
import com.xudod.attendance.fun_resource.interfaces.vo.FunResourceTreeVo;
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
public interface FunResourceService {
    
    /*代码分界head TODO*/


	Integer add(FunResource pojo);

	Integer delbykey(String id);

	Integer upbykey(FunResource pojo);

	FunResource getbykey(String id);
	
	IPage<FunResource> getpage(PageParameter<FunResource> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<FunResource> getAll();

	/*代码分界end TODO*/
	
	List<FunResourceTreeVo> getalltree(String sysCode);

}

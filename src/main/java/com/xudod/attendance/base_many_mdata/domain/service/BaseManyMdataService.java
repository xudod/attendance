package com.xudod.attendance.base_many_mdata.domain.service;

import com.xudod.attendance.base_many_mdata.domain.entity.po.BaseManyMdata;
import com.xudod.attendance.base_many_mdata.interfaces.vo.MdataGroupCodeInManyMdataVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.common.UpStateVo;
import java.util.List;


/**
 *
 * Created by xudod on 2020/04/27.
 */
public interface BaseManyMdataService {
    
    /*代码分界head TODO*/


	Integer add(BaseManyMdata pojo);

	Integer delbykey(String id);

	Integer upbykey(BaseManyMdata pojo);

	BaseManyMdata getbykey(String id);
	
	IPage<BaseManyMdata> getpage(PageParameter<BaseManyMdata> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<BaseManyMdata> getAll();

	/*代码分界end TODO*/
	
	List<BaseManyMdata> getmanymdata(MdataGroupCodeInManyMdataVo mdataGroupCodeVo);

}

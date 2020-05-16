package com.xudod.attendance.base_group_mdata.domain.service;

import com.xudod.attendance.base_group_mdata.domain.entity.po.BaseGroupMdata;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.common.UpStateVo;
import java.util.List;


/**
 *
 * Created by xudod on 2020/04/27.
 */
public interface BaseGroupMdataService {
    
    /*代码分界head TODO*/


	Integer add(BaseGroupMdata pojo);

	Integer delbykey(String id);

	Integer upbykey(BaseGroupMdata pojo);

	BaseGroupMdata getbykey(String id);
	
	IPage<BaseGroupMdata> getpage(PageParameter<BaseGroupMdata> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<BaseGroupMdata> getAll();

	/*代码分界end TODO*/
	
//	String getgroupidbycode(String code);


}

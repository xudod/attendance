package com.xudod.attendance.base_single_mdata.domain.service;

import com.xudod.attendance.base_single_mdata.domain.entity.po.BaseSingleMdata;
import com.xudod.attendance.base_single_mdata.interfaces.vo.MdataSingleCodeVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.common.UpStateVo;
import java.util.List;


/**
 *
 * Created by xudod on 2020/04/27.
 */
public interface BaseSingleMdataService {
    
    /*代码分界head TODO*/


	Integer add(BaseSingleMdata pojo);

	Integer delbykey(String id);

	Integer upbykey(BaseSingleMdata pojo);

	BaseSingleMdata getbykey(String id);
	
	IPage<BaseSingleMdata> getpage(PageParameter<BaseSingleMdata> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<BaseSingleMdata> getAll();

	/*代码分界end TODO*/
	
	BaseSingleMdata getbycode(MdataSingleCodeVo mdataSingleCodeVo);


}

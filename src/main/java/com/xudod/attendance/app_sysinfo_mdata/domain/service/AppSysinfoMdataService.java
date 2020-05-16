package com.xudod.attendance.app_sysinfo_mdata.domain.service;

import com.xudod.attendance.app_sysinfo_mdata.domain.entity.po.AppSysinfoMdata;
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
public interface AppSysinfoMdataService {
    
    /*代码分界head TODO*/


	Integer add(AppSysinfoMdata pojo);

	Integer delbykey(String id);

	Integer upbykey(AppSysinfoMdata pojo);

	AppSysinfoMdata getbykey(String id);
	
	IPage<AppSysinfoMdata> getpage(PageParameter<AppSysinfoMdata> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<AppSysinfoMdata> getAll();

	/*代码分界end TODO*/


}

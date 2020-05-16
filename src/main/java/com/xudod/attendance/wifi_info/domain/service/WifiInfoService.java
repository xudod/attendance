package com.xudod.attendance.wifi_info.domain.service;

import com.xudod.attendance.wifi_info.domain.entity.po.WifiInfo;
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
public interface WifiInfoService {
    
    /*代码分界head TODO*/


	Integer add(WifiInfo pojo);

	Integer delbykey(String id);

	Integer upbykey(WifiInfo pojo);

	WifiInfo getbykey(String id);
	
	IPage<WifiInfo> getpage(PageParameter<WifiInfo> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<WifiInfo> getAll();

	/*代码分界end TODO*/


}

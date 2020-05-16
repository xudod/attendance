package com.xudod.attendance.user_att_app_info.domain.service;

import com.xudod.attendance.user_att_app_info.domain.entity.po.UserAttAppInfo;
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
public interface UserAttAppInfoService {
    
    /*代码分界head TODO*/


	Integer add(UserAttAppInfo pojo);

	Integer delbykey(String id);

	Integer upbykey(UserAttAppInfo pojo);

	UserAttAppInfo getbykey(String id);
	
	IPage<UserAttAppInfo> getpage(PageParameter<UserAttAppInfo> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<UserAttAppInfo> getAll();

	/*代码分界end TODO*/


}

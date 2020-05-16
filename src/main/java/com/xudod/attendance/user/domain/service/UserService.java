package com.xudod.attendance.user.domain.service;

import com.xudod.attendance.user.domain.entity.po.User;
import com.xudod.attendance.user.interfaces.vo.InitWebPageVo;
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
public interface UserService {
    
    /*代码分界head TODO*/


	Integer add(User pojo);

	Integer delbykey(String id);

	Integer upbykey(User pojo);

	User getbykey(String id);
	
	IPage<User> getpage(PageParameter<User> page);

	Integer upStatebykey(UpStateVo upStateVo);

//	List<User> getAll();

	/*代码分界end TODO*/
	
	InitWebPageVo initWebPage();


}

package com.xudod.attendance.role.domain.service;

import com.xudod.attendance.role.domain.entity.po.Role;
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
public interface RoleService {
    
    /*代码分界head TODO*/


	Integer add(Role pojo);

	Integer delbykey(String id);

	Integer upbykey(Role pojo);

	Role getbykey(String id);
	
	IPage<Role> getpage(PageParameter<Role> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<Role> getAll();

	/*代码分界end TODO*/


}

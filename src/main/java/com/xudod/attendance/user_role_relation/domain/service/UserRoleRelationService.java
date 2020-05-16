package com.xudod.attendance.user_role_relation.domain.service;

import com.xudod.attendance.user_role_relation.domain.entity.po.UserRoleRelation;
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
public interface UserRoleRelationService {
    
    /*代码分界head TODO*/


	Integer add(UserRoleRelation pojo);

	Integer delbykey(String id);

	Integer upbykey(UserRoleRelation pojo);

	UserRoleRelation getbykey(String id);
	
	IPage<UserRoleRelation> getpage(PageParameter<UserRoleRelation> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<UserRoleRelation> getAll();

	/*代码分界end TODO*/


}

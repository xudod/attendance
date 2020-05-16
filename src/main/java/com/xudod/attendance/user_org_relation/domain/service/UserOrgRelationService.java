package com.xudod.attendance.user_org_relation.domain.service;

import com.xudod.attendance.user_org_relation.domain.entity.po.UserOrgRelation;
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
public interface UserOrgRelationService {
    
    /*代码分界head TODO*/


	Integer add(UserOrgRelation pojo);

	Integer delbykey(String id);

	Integer upbykey(UserOrgRelation pojo);

	UserOrgRelation getbykey(String id);
	
	IPage<UserOrgRelation> getpage(PageParameter<UserOrgRelation> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<UserOrgRelation> getAll();

	/*代码分界end TODO*/


}

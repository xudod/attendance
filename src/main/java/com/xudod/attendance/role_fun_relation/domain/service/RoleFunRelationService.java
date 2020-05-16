package com.xudod.attendance.role_fun_relation.domain.service;

import com.xudod.attendance.role_fun_relation.domain.entity.po.RoleFunRelation;
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
public interface RoleFunRelationService {
    
    /*代码分界head TODO*/


	Integer add(RoleFunRelation pojo);

	Integer delbykey(String id);

	Integer upbykey(RoleFunRelation pojo);

	RoleFunRelation getbykey(String id);
	
	IPage<RoleFunRelation> getpage(PageParameter<RoleFunRelation> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<RoleFunRelation> getAll();

	/*代码分界end TODO*/


}

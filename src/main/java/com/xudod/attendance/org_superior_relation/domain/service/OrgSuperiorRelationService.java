package com.xudod.attendance.org_superior_relation.domain.service;

import com.xudod.attendance.org_superior_relation.domain.entity.po.OrgSuperiorRelation;
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
public interface OrgSuperiorRelationService {
    
    /*代码分界head TODO*/


	Integer add(OrgSuperiorRelation pojo);

	Integer delbykey(String id);

	Integer upbykey(OrgSuperiorRelation pojo);

	OrgSuperiorRelation getbykey(String id);
	
	IPage<OrgSuperiorRelation> getpage(PageParameter<OrgSuperiorRelation> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<OrgSuperiorRelation> getAll();

	/*代码分界end TODO*/


}

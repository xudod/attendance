package com.xudod.attendance.org_indeustry_relation.domain.service;

import com.xudod.attendance.org_indeustry_relation.domain.entity.po.OrgIndeustryRelation;
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
public interface OrgIndeustryRelationService {
    
    /*代码分界head TODO*/


	Integer add(OrgIndeustryRelation pojo);

	Integer delbykey(String id);

	Integer upbykey(OrgIndeustryRelation pojo);

	OrgIndeustryRelation getbykey(String id);
	
	IPage<OrgIndeustryRelation> getpage(PageParameter<OrgIndeustryRelation> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<OrgIndeustryRelation> getAll();

	/*代码分界end TODO*/


}

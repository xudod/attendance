package com.xudod.attendance.org_produce_relation.domain.service;

import com.xudod.attendance.org_produce_relation.domain.entity.po.OrgProduceRelation;
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
public interface OrgProduceRelationService {
    
    /*代码分界head TODO*/


	Integer add(OrgProduceRelation pojo);

	Integer delbykey(String id);

	Integer upbykey(OrgProduceRelation pojo);

	OrgProduceRelation getbykey(String id);
	
	IPage<OrgProduceRelation> getpage(PageParameter<OrgProduceRelation> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<OrgProduceRelation> getAll();

	/*代码分界end TODO*/


}

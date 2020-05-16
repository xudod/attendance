package com.xudod.attendance.machine_user_relation.domain.service;

import com.xudod.attendance.machine_user_relation.domain.entity.po.MachineUserRelation;
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
public interface MachineUserRelationService {
    
    /*代码分界head TODO*/


	Integer add(MachineUserRelation pojo);

	Integer delbykey(String id);

	Integer upbykey(MachineUserRelation pojo);

	MachineUserRelation getbykey(String id);
	
	IPage<MachineUserRelation> getpage(PageParameter<MachineUserRelation> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<MachineUserRelation> getAll();

	/*代码分界end TODO*/


}

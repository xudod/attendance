package com.xudod.attendance.machine_user_tem.domain.service;

import com.xudod.attendance.machine_user_tem.domain.entity.po.MachineUserTem;
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
public interface MachineUserTemService {
    
    /*代码分界head TODO*/


	Integer add(MachineUserTem pojo);

	Integer delbykey(String id);

	Integer upbykey(MachineUserTem pojo);

	MachineUserTem getbykey(String id);
	
	IPage<MachineUserTem> getpage(PageParameter<MachineUserTem> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<MachineUserTem> getAll();

	/*代码分界end TODO*/


}

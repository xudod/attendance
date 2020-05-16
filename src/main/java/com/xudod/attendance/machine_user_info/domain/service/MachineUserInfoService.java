package com.xudod.attendance.machine_user_info.domain.service;

import com.xudod.attendance.machine_user_info.domain.entity.po.MachineUserInfo;
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
public interface MachineUserInfoService {
    
    /*代码分界head TODO*/


	Integer add(MachineUserInfo pojo);

	Integer delbykey(String id);

	Integer upbykey(MachineUserInfo pojo);

	MachineUserInfo getbykey(String id);
	
	IPage<MachineUserInfo> getpage(PageParameter<MachineUserInfo> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<MachineUserInfo> getAll();

	/*代码分界end TODO*/


}

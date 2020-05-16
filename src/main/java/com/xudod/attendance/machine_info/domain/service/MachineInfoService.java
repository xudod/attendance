package com.xudod.attendance.machine_info.domain.service;

import com.xudod.attendance.machine_info.domain.entity.po.MachineInfo;
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
public interface MachineInfoService {
    
    /*代码分界head TODO*/


	Integer add(MachineInfo pojo);

	Integer delbykey(String id);

	Integer upbykey(MachineInfo pojo);

	MachineInfo getbykey(String id);
	
	IPage<MachineInfo> getpage(PageParameter<MachineInfo> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<MachineInfo> getAll();

	/*代码分界end TODO*/


}

package com.xudod.attendance.machine_user_face.domain.service;

import com.xudod.attendance.machine_user_face.domain.entity.po.MachineUserFace;
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
public interface MachineUserFaceService {
    
    /*代码分界head TODO*/


	Integer add(MachineUserFace pojo);

	Integer delbykey(String id);

	Integer upbykey(MachineUserFace pojo);

	MachineUserFace getbykey(String id);
	
	IPage<MachineUserFace> getpage(PageParameter<MachineUserFace> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<MachineUserFace> getAll();

	/*代码分界end TODO*/


}

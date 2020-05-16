package com.xudod.attendance.emp_leave.domain.service;

import com.xudod.attendance.emp_leave.domain.entity.po.EmpLeave;
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
public interface EmpLeaveService {
    
    /*代码分界head TODO*/


	Integer add(EmpLeave pojo);

	Integer delbykey(String id);

	Integer upbykey(EmpLeave pojo);

	EmpLeave getbykey(String id);
	
	IPage<EmpLeave> getpage(PageParameter<EmpLeave> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<EmpLeave> getAll();

	/*代码分界end TODO*/


}

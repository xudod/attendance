package com.xudod.attendance.emp_attendance_add.domain.service;

import com.xudod.attendance.emp_attendance_add.domain.entity.po.EmpAttendanceAdd;
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
public interface EmpAttendanceAddService {
    
    /*代码分界head TODO*/


	Integer add(EmpAttendanceAdd pojo);

	Integer delbykey(String id);

	Integer upbykey(EmpAttendanceAdd pojo);

	EmpAttendanceAdd getbykey(String id);
	
	IPage<EmpAttendanceAdd> getpage(PageParameter<EmpAttendanceAdd> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<EmpAttendanceAdd> getAll();

	/*代码分界end TODO*/


}

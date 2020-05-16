package com.xudod.attendance.emp_business_trip.domain.service;

import com.xudod.attendance.emp_business_trip.domain.entity.po.EmpBusinessTrip;
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
public interface EmpBusinessTripService {
    
    /*代码分界head TODO*/


	Integer add(EmpBusinessTrip pojo);

	Integer delbykey(String id);

	Integer upbykey(EmpBusinessTrip pojo);

	EmpBusinessTrip getbykey(String id);
	
	IPage<EmpBusinessTrip> getpage(PageParameter<EmpBusinessTrip> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<EmpBusinessTrip> getAll();

	/*代码分界end TODO*/


}

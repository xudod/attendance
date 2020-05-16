package com.xudod.attendance.all_punch_record.domain.service;

import com.xudod.attendance.all_punch_record.domain.entity.po.AllPunchRecord;
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
public interface AllPunchRecordService {
    
    /*代码分界head TODO*/


	Integer add(AllPunchRecord pojo);

	Integer delbykey(String id);

	Integer upbykey(AllPunchRecord pojo);

	AllPunchRecord getbykey(String id);
	
	IPage<AllPunchRecord> getpage(PageParameter<AllPunchRecord> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<AllPunchRecord> getAll();

	/*代码分界end TODO*/


}

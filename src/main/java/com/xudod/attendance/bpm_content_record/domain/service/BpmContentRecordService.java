package com.xudod.attendance.bpm_content_record.domain.service;

import com.xudod.attendance.bpm_content_record.domain.entity.po.BpmContentRecord;
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
public interface BpmContentRecordService {
    
    /*代码分界head TODO*/


	Integer add(BpmContentRecord pojo);

	Integer delbykey(String id);

	Integer upbykey(BpmContentRecord pojo);

	BpmContentRecord getbykey(String id);
	
	IPage<BpmContentRecord> getpage(PageParameter<BpmContentRecord> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<BpmContentRecord> getAll();

	/*代码分界end TODO*/


}

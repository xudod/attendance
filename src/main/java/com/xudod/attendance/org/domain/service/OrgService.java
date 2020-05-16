package com.xudod.attendance.org.domain.service;

import com.xudod.attendance.org.domain.entity.po.Org;
import com.xudod.attendance.org.interfaces.vo.OrgTreeQueryPramVo;
import com.xudod.attendance.org.interfaces.vo.OrgTreeVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.common.PageParameter;
import com.xudod.attendance.common.UpStateVo;
import java.util.List;


/**
 *
 * Created by xudod on 2020/04/27.
 */
public interface OrgService {
    
    /*代码分界head TODO*/


	String add(Org pojo);

	Integer delbykey(String id);

	Integer upbykey(Org pojo);

	Org getbykey(String id);
	
	IPage<Org> getpage(PageParameter<Org> page);

	Integer upStatebykey(UpStateVo upStateVo);

	List<Org> getAll();

	/*代码分界end TODO*/
	
	List<Org> getTree(OrgTreeQueryPramVo orgTreeQueryPramVo);

	List<OrgTreeVo> getalltree();


}

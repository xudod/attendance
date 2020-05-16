package com.xudod.attendance.base_many_mdata.domain.service;

import com.xudod.attendance.base_group_mdata.domain.service.BaseGroupMdataService;
import com.xudod.attendance.base_many_mdata.domain.entity.po.BaseManyMdata;
import com.xudod.attendance.base_many_mdata.domain.mapper.BaseManyMdataMapper;
import com.xudod.attendance.base_many_mdata.interfaces.vo.MdataGroupCodeInManyMdataVo;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import java.util.List;
import org.slf4j.LoggerFactory;
import com.xudod.attendance.common.BusinessException;
import com.xudod.attendance.common.GenId;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.DataCorrectCheck;
import com.xudod.attendance.common.PageParameter;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 *
 * Created by xudod on 2020/04/27.
 */
@Service("baseManyMdataService")
public class BaseManyMdataImp implements BaseManyMdataService {

	@Value("${snowid.workerId}")
	private long workerId;
	
	@Value("${snowid.datacenterId}")
	private long datacenterId;
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
    private BaseManyMdataMapper baseManyMdataMapper;
	
	@Autowired
	private BaseGroupMdataService baseGroupMdataService;
    
    private Logger logger= LoggerFactory.getLogger(BaseManyMdataImp.class);
    
    /*代码分界head TODO*/

	
	@Override
	public Integer add(BaseManyMdata po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "新增数据时，检测到数据实体为null，保存失败！");
			if(null == po.getId() || "".equals(po.getId())) {
				po.setId(GenId.getUUID(workerId, datacenterId));
			}
			po.setCreateBy(null != request.getHeader("userid") ? request.getHeader("userid") : "");
			po.setSequence(baseManyMdataMapper.getSequence("base_many_mdata"));
			int res = baseManyMdataMapper.insert(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer delbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "删除数据时，检测到id字符串值为null，删除失败！");
			int res = baseManyMdataMapper.deleteById(id);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer upbykey(BaseManyMdata po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "更新数据时，检测到数据实体为null，更新失败！");
			po.setModifyBy(request.getHeader("userid"));
			int res = baseManyMdataMapper.updateById(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public BaseManyMdata getbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "查询数据时，检测到查询id为null，查询失败！");
			BaseManyMdata po = baseManyMdataMapper.selectById(id);
			return po;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public IPage<BaseManyMdata> getpage(PageParameter<BaseManyMdata> page) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(page, "查询数据时，检测到分页对象为null，查询失败！");
			Page<BaseManyMdata> ipage = new Page<BaseManyMdata>();
			BeanUtils.copyProperties(page, ipage);
			QueryWrapper<BaseManyMdata> queryWrapper = new QueryWrapper<>();
			String query = (String) page.getQuery();
			queryWrapper.eq("group_code", query);
	        IPage<BaseManyMdata> orgIPage = baseManyMdataMapper.selectPage(ipage, queryWrapper);
	        return orgIPage;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Integer upStatebykey(UpStateVo upStateVo) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(upStateVo, "更新数据时，检测到数据实体为null，更新失败！");
			String header = null != request.getHeader("userid") ? request.getHeader("userid") : "reqHeaderNull";
			int res = baseManyMdataMapper.upStatebykey(upStateVo.getId(), upStateVo.getStatus(), header);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public List<BaseManyMdata> getAll() {
		List<BaseManyMdata> res = baseManyMdataMapper.getAll();
		return res;
	}
	
	private void addUpDelResCheck(int res, String msg){
		if(res < 1){
			throw new BusinessException(res, msg);
		}
	}
	
	/*代码分界end TODO*/
	
	@Override
	public List<BaseManyMdata> getmanymdata(MdataGroupCodeInManyMdataVo mdataGroupCodeVo) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(mdataGroupCodeVo, "查询数据时，检测到数据实体为null，查询失败！");
//			String groupCode = baseGroupMdataService.getgroupidbycode(mdataGroupCodeVo.getMdataGroupCode());
			List<BaseManyMdata> getmanymdata = baseManyMdataMapper.getmanymdata(mdataGroupCodeVo.getMdataGroupCode());
			return getmanymdata;
		} catch (Exception e) {
			throw e;
		}
	}


	
}

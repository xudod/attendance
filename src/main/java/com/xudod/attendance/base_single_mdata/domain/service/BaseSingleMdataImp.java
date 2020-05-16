package com.xudod.attendance.base_single_mdata.domain.service;

import com.xudod.attendance.base_single_mdata.domain.entity.po.BaseSingleMdata;
import com.xudod.attendance.base_single_mdata.domain.mapper.BaseSingleMdataMapper;
import com.xudod.attendance.base_single_mdata.interfaces.vo.MdataSingleCodeVo;

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
@Service("baseSingleMdataService")
public class BaseSingleMdataImp implements BaseSingleMdataService {

	@Value("${snowid.workerId}")
	private long workerId;
	
	@Value("${snowid.datacenterId}")
	private long datacenterId;
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
    private BaseSingleMdataMapper baseSingleMdataMapper;
    
    private Logger logger= LoggerFactory.getLogger(BaseSingleMdataImp.class);
    
    /*代码分界head TODO*/

	
	@Override
	public Integer add(BaseSingleMdata po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "新增数据时，检测到数据实体为null，保存失败！");
			if(null == po.getId() || "".equals(po.getId())) {
				po.setId(GenId.getUUID(workerId, datacenterId));
			}
			po.setCreateBy(null != request.getHeader("userid") ? request.getHeader("userid") : "");
			po.setSequence(baseSingleMdataMapper.getSequence("base_single_mdata"));
			int res = baseSingleMdataMapper.insert(po);
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
			int res = baseSingleMdataMapper.deleteById(id);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer upbykey(BaseSingleMdata po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "更新数据时，检测到数据实体为null，更新失败！");
			po.setModifyBy(request.getHeader("userid"));
			int res = baseSingleMdataMapper.updateById(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public BaseSingleMdata getbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "查询数据时，检测到查询id为null，查询失败！");
			BaseSingleMdata po = baseSingleMdataMapper.selectById(id);
			return po;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public IPage<BaseSingleMdata> getpage(PageParameter<BaseSingleMdata> page) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(page, "查询数据时，检测到分页对象为null，查询失败！");
			Page<BaseSingleMdata> ipage = new Page<BaseSingleMdata>();
			BeanUtils.copyProperties(page, ipage);
	        IPage<BaseSingleMdata> orgIPage = baseSingleMdataMapper.selectPage(ipage, new QueryWrapper<BaseSingleMdata>());
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
			int res = baseSingleMdataMapper.upStatebykey(upStateVo.getId(), upStateVo.getStatus(), header);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public List<BaseSingleMdata> getAll() {
		List<BaseSingleMdata> res = baseSingleMdataMapper.getAll();
		return res;
	}
	
	private void addUpDelResCheck(int res, String msg){
		if(res < 1){
			throw new BusinessException(res, msg);
		}
	}
	
	/*代码分界end TODO*/
	
	@Override
	public BaseSingleMdata getbycode(MdataSingleCodeVo mdataSingleCodeVo) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(mdataSingleCodeVo, "查询数据时，检测到查询条件为null，更新失败！");
			BaseSingleMdata baseSingleMdata = baseSingleMdataMapper.getbycode(mdataSingleCodeVo.getMdataSingleCode());
			return baseSingleMdata;
		} catch (Exception e) {
			throw e;
		}
	}

}

package com.xudod.attendance.org.domain.service;

import com.xudod.attendance.org.domain.entity.po.Org;
import com.xudod.attendance.org.domain.mapper.OrgMapper;
import com.xudod.attendance.org.interfaces.vo.OrgTreeQueryPramVo;
import com.xudod.attendance.org.interfaces.vo.OrgTreeVo;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 *
 * Created by xudod on 2020/04/27.
 */
@Service("orgService")
public class OrgImp implements OrgService {

	@Value("${snowid.workerId}")
	private long workerId;
	
	@Value("${snowid.datacenterId}")
	private long datacenterId;
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
    private OrgMapper orgMapper;
    
    private Logger logger= LoggerFactory.getLogger(OrgImp.class);
    
    /*代码分界head TODO*/

	
	@Override
	public String add(Org po) {
		try {
			String uuid = GenId.getUUID(workerId, datacenterId);
			DataCorrectCheck.PojoIsNotNullCheck(po, "新增数据时，检测到数据实体为null，保存失败！");
			Integer sequence = orgMapper.getSequence("org");
			if(null == po.getMdmCode() || "".equals(po.getMdmCode())) {
				po.setMdmCode("000000" + sequence); // TODO 将来这些规则都放在码生成微服务中。
			}
			if(null == po.getId() || "".equals(po.getId())) {
				po.setId(uuid);
			}
			po.setCreateBy(null != request.getHeader("userid") ? request.getHeader("userid") : "");
			po.setSequence(sequence);
			int res = orgMapper.insert(po);
			addUpDelResCheck(res, "更新数据失败！");
			return uuid;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer delbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "删除数据时，检测到id字符串值为null，删除失败！");
			int res = orgMapper.deleteById(id);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer upbykey(Org po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "更新数据时，检测到数据实体为null，更新失败！");
			po.setModifyBy(request.getHeader("userid"));
			int res = orgMapper.updateById(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Org getbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "查询数据时，检测到查询id为null，查询失败！");
			Org po = orgMapper.selectById(id);
			return po;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public IPage<Org> getpage(PageParameter<Org> page) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(page, "查询数据时，检测到分页对象为null，查询失败！");
			String query =  (String) page.getQuery();
			
			JSONObject parseObject = JSONObject.parseObject(query);
			String orgDimension = (String) parseObject.get("orgDimension");
			String superiorCode = (String) parseObject.get("superiorCode");
			
			Page<Org> ipage = new Page<Org>();
			BeanUtils.copyProperties(page, ipage);
			QueryWrapper<Org> queryWrapper = new QueryWrapper<>();
			if(null == superiorCode || "".equals(superiorCode)) {
				superiorCode = "0";
			}
			queryWrapper.eq("superior_code", superiorCode);
			if(null == orgDimension || "".equals(orgDimension)) {
				orgDimension = "solid"; // TODO 这里替换成从码表获取相关参数的第一个。
			}
			queryWrapper.eq(null != orgDimension && !"".equals(orgDimension), "org_dimension", orgDimension);
	        IPage<Org> orgIPage = orgMapper.selectPage(ipage, queryWrapper);
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
			int res = orgMapper.upStatebykey(upStateVo.getId(), upStateVo.getStatus(), header);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public List<Org> getAll() {
		List<Org> res = orgMapper.getAll();
		return res;
	}
	
	private void addUpDelResCheck(int res, String msg){
		if(res < 1){
			throw new BusinessException(res, msg);
		}
	}
	
	/*代码分界end TODO*/

	@Override
	public List<Org> getTree(OrgTreeQueryPramVo orgTreeQueryPramVo) {
		String superiorCode = "";
		String orgDimension = orgTreeQueryPramVo.getOrgDimension();
		if(null != orgTreeQueryPramVo && null != orgTreeQueryPramVo.getSuperiorCode() && !"".equals(orgTreeQueryPramVo.getSuperiorCode())) {
			superiorCode = orgTreeQueryPramVo.getSuperiorCode();
		}else {
			superiorCode = "0";
		}
		QueryWrapper<Org> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("superior_code", superiorCode);
		if(null == orgDimension || "".equals(orgDimension)) {
			orgDimension = "solid"; // TODO 这里替换成从码表获取相关参数的第一个。
		}
		queryWrapper.eq(null != orgDimension && !"".equals(orgDimension), "org_dimension", orgDimension);
		List<Org> orgListByPid = orgMapper.selectList(queryWrapper);
		return orgListByPid;
	}

	@Override
	public List<OrgTreeVo> getalltree() {
		List<Org> all = getAllOlnyTreeNeedColumn();
		List<Org> orgRoot = all.stream().filter(x -> (null == x.getSuperiorCode() || "0".equals(x.getSuperiorCode()))).collect(Collectors.toList());
		List<OrgTreeVo> orgTree = createTree(all, orgRoot);
		return orgTree;
	}

	private List<Org> getAllOlnyTreeNeedColumn() {
		List<Org> allOlnyTreeNeedColumn = orgMapper.getAllOlnyTreeNeedColumn();
		return allOlnyTreeNeedColumn;
	}

	private List<OrgTreeVo> createTree(List<Org> all, List<Org> orgRoot) {
		List<OrgTreeVo> orgTreeVoList = new ArrayList<OrgTreeVo>();
		OrgTreeVo orgTreeVo = new OrgTreeVo();
		for (Org org : orgRoot) {
			//all.remove(org);
			orgTreeVo = new OrgTreeVo();
			BeanUtils.copyProperties(org, orgTreeVo);
			List<Org> collect1 = all.stream().filter(x -> (org.getMdmCode().equals(x.getSuperiorCode()))).collect(Collectors.toList());
			if(null != collect1 && collect1.size() > 0) {
				List<OrgTreeVo> createTree = createTree(all, collect1);
				orgTreeVo.setOrgList(createTree);
			}
			orgTreeVoList.add(orgTreeVo);
		}
		return orgTreeVoList;
	}
	
}

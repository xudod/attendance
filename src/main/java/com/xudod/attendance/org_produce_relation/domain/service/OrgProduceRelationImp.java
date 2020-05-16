package com.xudod.attendance.org_produce_relation.domain.service;

import com.xudod.attendance.org_produce_relation.domain.entity.po.OrgProduceRelation;
import com.xudod.attendance.org_produce_relation.domain.mapper.OrgProduceRelationMapper;
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
@Service("orgProduceRelationService")
public class OrgProduceRelationImp implements OrgProduceRelationService {

	@Value("${snowid.workerId}")
	private long workerId;
	
	@Value("${snowid.datacenterId}")
	private long datacenterId;
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
    private OrgProduceRelationMapper orgProduceRelationMapper;
    
    private Logger logger= LoggerFactory.getLogger(OrgProduceRelationImp.class);
    
    /*代码分界head TODO*/

	
	@Override
	public Integer add(OrgProduceRelation po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "新增数据时，检测到数据实体为null，保存失败！");
			if(null == po.getId() || "".equals(po.getId())) {
				po.setId(GenId.getUUID(workerId, datacenterId));
			}
			po.setCreateBy(null != request.getHeader("userid") ? request.getHeader("userid") : "");
			po.setSequence(orgProduceRelationMapper.getSequence("org_produce_relation"));
			int res = orgProduceRelationMapper.insert(po);
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
			int res = orgProduceRelationMapper.deleteById(id);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer upbykey(OrgProduceRelation po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "更新数据时，检测到数据实体为null，更新失败！");
			po.setModifyBy(request.getHeader("userid"));
			int res = orgProduceRelationMapper.updateById(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public OrgProduceRelation getbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "查询数据时，检测到查询id为null，查询失败！");
			OrgProduceRelation po = orgProduceRelationMapper.selectById(id);
			return po;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public IPage<OrgProduceRelation> getpage(PageParameter<OrgProduceRelation> page) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(page, "查询数据时，检测到分页对象为null，查询失败！");
			Page<OrgProduceRelation> ipage = new Page<OrgProduceRelation>();
			BeanUtils.copyProperties(page, ipage);
	        IPage<OrgProduceRelation> orgIPage = orgProduceRelationMapper.selectPage(ipage, new QueryWrapper<OrgProduceRelation>());
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
			int res = orgProduceRelationMapper.upStatebykey(upStateVo.getId(), upStateVo.getStatus(), header);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public List<OrgProduceRelation> getAll() {
		List<OrgProduceRelation> res = orgProduceRelationMapper.getAll();
		return res;
	}
	
	private void addUpDelResCheck(int res, String msg){
		if(res < 1){
			throw new BusinessException(res, msg);
		}
	}
	
	/*代码分界end TODO*/


	
}

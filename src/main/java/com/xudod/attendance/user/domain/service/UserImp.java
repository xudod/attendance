package com.xudod.attendance.user.domain.service;

import com.xudod.attendance.user.domain.entity.po.User;
import com.xudod.attendance.user.domain.feign.org.OrgFeignInf;
import com.xudod.attendance.user.domain.feign.role.RoleFeignInf;
import com.xudod.attendance.user.domain.mapper.UserMapper;
import com.xudod.attendance.user.interfaces.vo.InitWebPageVo;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import java.util.List;
import org.slf4j.LoggerFactory;

import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.BusinessException;
import com.xudod.attendance.common.GenId;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.org.domain.entity.po.Org;
import com.xudod.attendance.org.interfaces.vo.OrgTreeVo;
import com.xudod.attendance.role.domain.entity.po.Role;
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
@Service("userService")
public class UserImp implements UserService {

	@Value("${snowid.workerId}")
	private long workerId;
	
	@Value("${snowid.datacenterId}")
	private long datacenterId;
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
    private UserMapper userMapper;
	
	@Autowired
	private OrgFeignInf orgFeignInf;
	
	@Autowired
	private RoleFeignInf roleFeignInf;
    
    private Logger logger= LoggerFactory.getLogger(UserImp.class);
    
    /*代码分界head TODO*/

	
	@Override
	public Integer add(User po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "新增数据时，检测到数据实体为null，保存失败！");
			if(null == po.getId() || "".equals(po.getId())) {
				po.setId(GenId.getUUID(workerId, datacenterId));
			}
			po.setCreateBy(null != request.getHeader("userid") ? request.getHeader("userid") : "");
			po.setSequence(userMapper.getSequence("user"));
			int res = userMapper.insert(po);
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
			int res = userMapper.deleteById(id);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public Integer upbykey(User po) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(po, "更新数据时，检测到数据实体为null，更新失败！");
			po.setModifyBy(request.getHeader("userid"));
			int res = userMapper.updateById(po);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public User getbykey(String id) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(id, "查询数据时，检测到查询id为null，查询失败！");
			User po = userMapper.selectById(id);
			return po;
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public IPage<User> getpage(PageParameter<User> page) {
		try {
			DataCorrectCheck.PojoIsNotNullCheck(page, "查询数据时，检测到分页对象为null，查询失败！");
			Page<User> ipage = new Page<User>();
			BeanUtils.copyProperties(page, ipage);
			Object query = page.getQuery();
			QueryWrapper<User> queryWrapper = new QueryWrapper<>();
			queryWrapper.eq(null != query && !"".equals(query), "department_code", query);
	        IPage<User> orgIPage = userMapper.selectPage(ipage, queryWrapper);
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
			int res = userMapper.upStatebykey(upStateVo.getId(), upStateVo.getStatus(), header);
			addUpDelResCheck(res, "更新数据失败！");
			return res;
		} catch (Exception e) {
			throw e;
		}
	}
	
//	@Override
//	public List<User> getAll() {
//		List<User> res = userMapper.getAll();
//		return res;
//	}
	
	private void addUpDelResCheck(int res, String msg){
		if(res < 1){
			throw new BusinessException(res, msg);
		}
	}
	
	/*代码分界end TODO*/

	@SuppressWarnings("unchecked")
	@Override
	public InitWebPageVo initWebPage() {
		InitWebPageVo initWebPageVo = new InitWebPageVo();
		BaseResp<List<OrgTreeVo>> org = orgFeignInf.getOrg();
		BaseResp<List<Role>> role = roleFeignInf.getRole();
		List<OrgTreeVo> orgTreeVos = (List<OrgTreeVo>) org.getData();
		List<Role> roles = (List<Role>) role.getData();
		initWebPageVo.setOrgTreeVoList("200".equals("" + org.getCode()) ? orgTreeVos : null);
		initWebPageVo.setRoleList("200".equals("" + role.getCode()) ? roles : null);
		IPage<User> getpage = getpage(new PageParameter<User>());
		initWebPageVo.setUserPage(getpage);
		return initWebPageVo;
	}
	
}

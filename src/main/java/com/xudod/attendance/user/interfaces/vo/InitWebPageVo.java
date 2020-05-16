package com.xudod.attendance.user.interfaces.vo;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.org.interfaces.vo.OrgTreeVo;
import com.xudod.attendance.role.domain.entity.po.Role;
import com.xudod.attendance.user.domain.entity.po.User;

public class InitWebPageVo {

	private IPage<User> userPage;
	
	private List<OrgTreeVo> orgTreeVoList;
	
	private List<Role> roleList;

	public IPage<User> getUserPage() {
		return userPage;
	}

	public void setUserPage(IPage<User> userPage) {
		this.userPage = userPage;
	}

	public List<OrgTreeVo> getOrgTreeVoList() {
		return orgTreeVoList;
	}

	public void setOrgTreeVoList(List<OrgTreeVo> orgTreeVoList) {
		this.orgTreeVoList = orgTreeVoList;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	
}

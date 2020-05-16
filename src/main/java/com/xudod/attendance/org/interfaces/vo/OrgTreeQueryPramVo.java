package com.xudod.attendance.org.interfaces.vo;


/**
 * 组织树查询条件
 */
public class OrgTreeQueryPramVo {
	
	private String superiorCode;

	private String orgDimension;

	public String getSuperiorCode() {
		return superiorCode;
	}

	public void setSuperiorCode(String superiorCode) {
		this.superiorCode = superiorCode;
	}

	public String getOrgDimension() {
		return orgDimension;
	}

	public void setOrgDimension(String orgDimension) {
		this.orgDimension = orgDimension;
	}
}

package com.xudod.attendance.org.interfaces.vo;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class OrgTreeVo {

    @ApiModelProperty(example = "主数据编码", position = 2)
    private String mdmCode;

    @ApiModelProperty(example = "单位名称", position = 4)
    private String name;

    @ApiModelProperty(example = "上级单位编码", position = 21)
    private String superiorCode;
	
	private List<OrgTreeVo> orgList;

	public List<OrgTreeVo> getOrgList() {
		return orgList;
	}

	public void setOrgList(List<OrgTreeVo> orgList) {
		this.orgList = orgList;
	}

	public String getMdmCode() {
		return mdmCode;
	}

	public void setMdmCode(String mdmCode) {
		this.mdmCode = mdmCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperiorCode() {
		return superiorCode;
	}

	public void setSuperiorCode(String superiorCode) {
		this.superiorCode = superiorCode;
	}
	
}

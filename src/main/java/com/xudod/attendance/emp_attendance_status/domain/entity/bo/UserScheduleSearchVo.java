package com.xudod.attendance.emp_attendance_status.domain.entity.bo;

import java.util.List;

public class UserScheduleSearchVo {
	
	private String userName;
	
	private String empMdmCode;
	
	private List<UserScheduleSearchChildVo> userScheduleSearchChildVoList;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<UserScheduleSearchChildVo> getUserScheduleSearchChildVoList() {
		return userScheduleSearchChildVoList;
	}

	public void setUserScheduleSearchChildVoList(List<UserScheduleSearchChildVo> userScheduleSearchChildVoList) {
		this.userScheduleSearchChildVoList = userScheduleSearchChildVoList;
	}

	public String getEmpMdmCode() {
		return empMdmCode;
	}

	public void setEmpMdmCode(String empMdmCode) {
		this.empMdmCode = empMdmCode;
	}
	
}

package com.xudod.attendance.emp_attendance_status.interfaces.so;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "获取排班数据日期范围参数")
public class UserScheduleSearchParam {

	//谁来查询，将来会做jwt鉴权，可以获取当前使用人的信息。
	//人员的话，暂时先设定几个固定的人，等以后做这方面功能再实现复杂的人员控制。
	
	@ApiModelProperty(example = "startDate", position = 1)
	private String startDate;
	
	@ApiModelProperty(example = "endDate", position = 2)
	private String endDate;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}

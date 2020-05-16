package com.xudod.attendance.emp_attendance_status.domain.entity.bo;

public class UserScheduleSearchChildVo {
	
	private String id;
	
	private String day;
	
	private String scheduleCode;
	
	private String addtime; //加班时间，有其他的属性以后再补。

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getScheduleCode() {
		return scheduleCode;
	}

	public void setScheduleCode(String scheduleCode) {
		this.scheduleCode = scheduleCode;
	}

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

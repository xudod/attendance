package com.xudod.attendance.emp_attendance_status.interfaces.vo;

import java.util.HashMap;
import java.util.List;

public class UserScheduleResVo {
	
	public UserScheduleResVo() {}
	
	public UserScheduleResVo(List<String> dateList, List<HashMap<String, Object>> arrayList) {
		super();
		this.dateList = dateList;
		this.arrayList = arrayList;
	}

	private List<String> dateList;
	
	private List<HashMap<String, Object>> arrayList;

	public List<String> getDateList() {
		return dateList;
	}

	public void setDateList(List<String> dateList) {
		this.dateList = dateList;
	}

	public List<HashMap<String, Object>> getArrayList() {
		return arrayList;
	}

	public void setArrayList(List<HashMap<String, Object>> arrayList) {
		this.arrayList = arrayList;
	}

}

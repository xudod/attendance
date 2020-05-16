package com.xudod.attendance.emp_attendance_status.domain.feign.user_att_app_info;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.user_att_app_info.domain.entity.po.UserAttAppInfo;

@FeignClient(value = "attendance", fallback = UserAttAppInfoFeignImp.class)
public interface UserAttAppInfoFeignInf {

	@RequestMapping(value = "/api/userAttAppInfo/getall", method= RequestMethod.POST)
	BaseResp<List<UserAttAppInfo>> getall();
	
}
package com.xudod.attendance.user.domain.feign.role;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.role.domain.entity.po.Role;

@FeignClient(value = "attendance", fallback = RoleFeignImp.class)
public interface RoleFeignInf {

	@RequestMapping(value = "/api/role/getall", method= RequestMethod.POST)
	BaseResp<List<Role>> getRole();
	
}
package com.xudod.attendance.user.domain.feign.org;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.org.interfaces.vo.OrgTreeVo;

@FeignClient(value = "attendance", fallback = OrgFeignImp.class)
public interface OrgFeignInf {

	@RequestMapping(value = "/api/org/getalltree", method= RequestMethod.POST)
	BaseResp<List<OrgTreeVo>> getOrg();
	
}
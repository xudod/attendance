package com.xudod.attendance.user.domain.feign.role;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.role.domain.entity.po.Role;

@Component
public class RoleFeignImp implements RoleFeignInf {

	@Override
	public BaseResp<List<Role>> getRole() {
		// TODO Auto-generated method stub
		return BaseResp.returnRes(455, null, "调用组织接口时，熔断器触发了！");
	}

}

package com.xudod.attendance.user.domain.feign.org;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.org.interfaces.vo.OrgTreeVo;

@Component
public class OrgFeignImp implements OrgFeignInf {

	@Override
	public BaseResp<List<OrgTreeVo>> getOrg() {
		// TODO Auto-generated method stub
		return BaseResp.returnRes(455, null, "调用组织接口时，熔断器触发了！");
	}

}

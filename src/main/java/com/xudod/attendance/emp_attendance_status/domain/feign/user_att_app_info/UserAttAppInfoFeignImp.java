package com.xudod.attendance.emp_attendance_status.domain.feign.user_att_app_info;

import java.util.List;
import org.springframework.stereotype.Component;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.user_att_app_info.domain.entity.po.UserAttAppInfo;

@Component
public class UserAttAppInfoFeignImp implements UserAttAppInfoFeignInf {

	@Override
	public BaseResp<List<UserAttAppInfo>> getall() {
		// TODO Auto-generated method stub
		return BaseResp.returnRes(455, null, "调用组织接口时，熔断器触发了！");
	}

}

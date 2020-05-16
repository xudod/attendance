package com.xudod.attendance.user_schedule.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.user_schedule.domain.entity.po.UserSchedule;
import com.xudod.attendance.user_schedule.domain.service.UserScheduleService;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "人员排班信息，排班对应的任何处理，对应的都是排班的时间，而不是自然天周而复始的时间。当schedule_change_id为有值，则使用该id。计算过的排班时间信息由单独的服务处理完后，存入数据库后，再存在redis中，功能接口", produces = "application/json", tags = "人员排班信息，排班对应的任何处理，对应的都是排班的时间，而不是自然天周而复始的时间。当schedule_change_id为有值，则使用该id。计算过的排班时间信息由单独的服务处理完后，存入数据库后，再存在redis中，功能接口")
@RestController
@RequestMapping("/api/userSchedule/")
public class UserScheduleController {

    @Autowired
    UserScheduleService userScheduleService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> add(@RequestBody UserSchedule pojo){
    	return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userScheduleService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userScheduleService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody UserSchedule pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userScheduleService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<UserSchedule>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<UserSchedule>> (BaseResp.returnRes(200, userScheduleService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<UserSchedule>>> getpage(@RequestBody PageParameter<UserSchedule> page){
        return new ResponseEntity<BaseResp<IPage<UserSchedule>>> (
        	BaseResp.returnRes(200, userScheduleService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userScheduleService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "getall", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<UserSchedule>>> getall(@RequestBody Object object){
        return new ResponseEntity<BaseResp<List<UserSchedule>>> (
        	BaseResp.returnRes(200, userScheduleService.getAll(), "查询成功！"), HttpStatus.OK);
    }
    
	/*代码分界end TODO*/



}

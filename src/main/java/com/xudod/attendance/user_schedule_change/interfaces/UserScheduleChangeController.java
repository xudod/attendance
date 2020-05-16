package com.xudod.attendance.user_schedule_change.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.user_schedule_change.domain.entity.po.UserScheduleChange;
import com.xudod.attendance.user_schedule_change.domain.service.UserScheduleChangeService;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "成员排班时间发生变化后时间存储表，影响该表数据的原因数据比如请假数据等，用关系表关联功能接口", produces = "application/json", tags = "成员排班时间发生变化后时间存储表，影响该表数据的原因数据比如请假数据等，用关系表关联功能接口")
@RestController
@RequestMapping("/api/userScheduleChange/")
public class UserScheduleChangeController {

    @Autowired
    UserScheduleChangeService userScheduleChangeService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> add(@RequestBody UserScheduleChange pojo){
    	return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userScheduleChangeService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userScheduleChangeService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody UserScheduleChange pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userScheduleChangeService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<UserScheduleChange>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<UserScheduleChange>> (BaseResp.returnRes(200, userScheduleChangeService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<UserScheduleChange>>> getpage(@RequestBody PageParameter<UserScheduleChange> page){
        return new ResponseEntity<BaseResp<IPage<UserScheduleChange>>> (
        	BaseResp.returnRes(200, userScheduleChangeService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userScheduleChangeService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "getall", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<UserScheduleChange>>> getall(@RequestBody Object object){
        return new ResponseEntity<BaseResp<List<UserScheduleChange>>> (
        	BaseResp.returnRes(200, userScheduleChangeService.getAll(), "查询成功！"), HttpStatus.OK);
    }
    
	/*代码分界end TODO*/



}

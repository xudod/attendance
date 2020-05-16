package com.xudod.attendance.emp_attendance_status.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.emp_attendance_status.domain.entity.po.EmpAttendanceStatus;
import com.xudod.attendance.emp_attendance_status.domain.service.EmpAttendanceStatusService;
import com.xudod.attendance.emp_attendance_status.interfaces.so.UserScheduleSearchParam;
import com.xudod.attendance.emp_attendance_status.interfaces.vo.UserScheduleResVo;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "考勤状态展示功能接口", produces = "application/json", tags = "考勤状态展示功能接口")
@RestController
@RequestMapping("/api/empAttendanceStatus/")
public class EmpAttendanceStatusController {

    @Autowired
    EmpAttendanceStatusService empAttendanceStatusService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> add(@RequestBody EmpAttendanceStatus pojo){
    	return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, empAttendanceStatusService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, empAttendanceStatusService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody EmpAttendanceStatus pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, empAttendanceStatusService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<EmpAttendanceStatus>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<EmpAttendanceStatus>> (BaseResp.returnRes(200, empAttendanceStatusService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<EmpAttendanceStatus>>> getpage(@RequestBody PageParameter<EmpAttendanceStatus> page){
        return new ResponseEntity<BaseResp<IPage<EmpAttendanceStatus>>> (
        	BaseResp.returnRes(200, empAttendanceStatusService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, empAttendanceStatusService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "getall", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<EmpAttendanceStatus>>> getall(@RequestBody Object object){
        return new ResponseEntity<BaseResp<List<EmpAttendanceStatus>>> (
        	BaseResp.returnRes(200, empAttendanceStatusService.getAll(), "查询成功！"), HttpStatus.OK);
    }
    
	/*代码分界end TODO*/

    @ApiOperation(value = "查询管理范围内成员的排班信息", notes = "查询管理范围内成员的排班信息")
    @RequestMapping(value = "getuserschedule", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<UserScheduleResVo>> getuserschedule(@RequestBody UserScheduleSearchParam userScheduleSearchParam){
        return new ResponseEntity<BaseResp<UserScheduleResVo>> (
        	BaseResp.returnRes(200, empAttendanceStatusService.getuserschedule(userScheduleSearchParam), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "批量保存排班信息", notes = "批量保存排班信息")
    @RequestMapping(value = "schedulebatchadd", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<String>> schedulebatchadd(@RequestBody List<EmpAttendanceStatus> empAttendanceStatusList){
        return new ResponseEntity<BaseResp<String>> (
        	BaseResp.returnRes(200, empAttendanceStatusService.schedulebatchadd(empAttendanceStatusList), "查询成功！"), HttpStatus.OK);
    }



}

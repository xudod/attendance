package com.xudod.attendance.user.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.user.domain.entity.po.User;
import com.xudod.attendance.user.domain.service.UserService;
import com.xudod.attendance.user.interfaces.vo.InitWebPageVo;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "人员信息表，数据来源于主数据功能接口", produces = "application/json", tags = "人员信息表，数据来源于主数据功能接口")
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    UserService userService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> add(@RequestBody User pojo){
    	return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody User pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<User>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<User>> (BaseResp.returnRes(200, userService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<User>>> getpage(@RequestBody PageParameter<User> page){
        return new ResponseEntity<BaseResp<IPage<User>>> (
        	BaseResp.returnRes(200, userService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, userService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

//    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
//    @RequestMapping(value = "getall", method=RequestMethod.POST)
//    ResponseEntity<BaseResp<List<User>>> getall(){
//        return new ResponseEntity<BaseResp<List<User>>> (
//        	BaseResp.returnRes(200, userService.getAll(), "查询成功！"), HttpStatus.OK);
//    }
    
	/*代码分界end TODO*/

    @ApiOperation(value = "user页面初始化数据获取", notes = "user页面初始化数据获取")
    @RequestMapping(value = "initwebpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<InitWebPageVo>> initWebPage(@RequestBody Object object){
        return new ResponseEntity<BaseResp<InitWebPageVo>> (
        	BaseResp.returnRes(200, userService.initWebPage(), "查询成功！"), HttpStatus.OK);
    }
    


}

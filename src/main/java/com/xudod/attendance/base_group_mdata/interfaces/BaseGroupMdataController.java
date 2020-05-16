package com.xudod.attendance.base_group_mdata.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.base_group_mdata.domain.entity.po.BaseGroupMdata;
import com.xudod.attendance.base_group_mdata.domain.service.BaseGroupMdataService;
import com.xudod.attendance.base_group_mdata.interfaces.vo.MdataGroupCodeInGroupVo;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "多键值码表分组信息数据功能接口", produces = "application/json", tags = "多键值码表分组信息数据功能接口")
@RestController
@RequestMapping("/api/baseGroupMdata/")
public class BaseGroupMdataController {

    @Autowired
    BaseGroupMdataService baseGroupMdataService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> add(@RequestBody BaseGroupMdata pojo){
    	return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseGroupMdataService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseGroupMdataService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody BaseGroupMdata pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseGroupMdataService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<BaseGroupMdata>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<BaseGroupMdata>> (BaseResp.returnRes(200, baseGroupMdataService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<BaseGroupMdata>>> getpage(@RequestBody PageParameter<BaseGroupMdata> page){
        return new ResponseEntity<BaseResp<IPage<BaseGroupMdata>>> (
        	BaseResp.returnRes(200, baseGroupMdataService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseGroupMdataService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "getall", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<BaseGroupMdata>>> getall(@RequestBody Object object){
        return new ResponseEntity<BaseResp<List<BaseGroupMdata>>> (
        	BaseResp.returnRes(200, baseGroupMdataService.getAll(), "查询成功！"), HttpStatus.OK);
    }
    
	/*代码分界end TODO*/

//    @ApiOperation(value = "根据分组code查询分组id", notes = "根据分组code查询分组id")
//    @RequestMapping(value = "getgroupidbycode", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
//    ResponseEntity<BaseResp<String>> getgroupidbycode(@RequestBody MdataGroupCodeInGroupVo mdataGroupCodeInGroupVo){
//        return new ResponseEntity<BaseResp<String>> (
//        	BaseResp.returnRes(200, baseGroupMdataService.getgroupidbycode(mdataGroupCodeInGroupVo.getMdataGroupCode()), "查询成功！"), HttpStatus.OK);
//    }

}

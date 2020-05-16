package com.xudod.attendance.base_single_mdata.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.base_single_mdata.domain.entity.po.BaseSingleMdata;
import com.xudod.attendance.base_single_mdata.domain.service.BaseSingleMdataService;
import com.xudod.attendance.base_single_mdata.interfaces.vo.MdataSingleCodeVo;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "单键值码表数据功能接口", produces = "application/json", tags = "单键值码表数据功能接口")
@RestController
@RequestMapping("/api/baseSingleMdata/")
public class BaseSingleMdataController {

    @Autowired
    BaseSingleMdataService baseSingleMdataService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> add(@RequestBody BaseSingleMdata pojo){
    	return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseSingleMdataService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseSingleMdataService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody BaseSingleMdata pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseSingleMdataService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<BaseSingleMdata>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<BaseSingleMdata>> (BaseResp.returnRes(200, baseSingleMdataService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<BaseSingleMdata>>> getpage(@RequestBody PageParameter<BaseSingleMdata> page){
        return new ResponseEntity<BaseResp<IPage<BaseSingleMdata>>> (
        	BaseResp.returnRes(200, baseSingleMdataService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseSingleMdataService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "getall", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<BaseSingleMdata>>> getall(@RequestBody Object object){
        return new ResponseEntity<BaseResp<List<BaseSingleMdata>>> (
        	BaseResp.returnRes(200, baseSingleMdataService.getAll(), "查询成功！"), HttpStatus.OK);
    }
    
	/*代码分界end TODO*/
    
    @ApiOperation(value = "根据单键值编码查询一条码表数据", notes = "根据单键值编码查询一条码表数据")
    @RequestMapping(value = "getbycode", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<BaseSingleMdata>> getbycode(@RequestBody MdataSingleCodeVo mdataSingleCodeVo){
        return new ResponseEntity<BaseResp<BaseSingleMdata>> (
        		BaseResp.returnRes(200, baseSingleMdataService.getbycode(mdataSingleCodeVo), "查询成功！"), HttpStatus.OK);
    }

}

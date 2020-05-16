package com.xudod.attendance.base_many_mdata.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.base_many_mdata.domain.entity.po.BaseManyMdata;
import com.xudod.attendance.base_many_mdata.domain.service.BaseManyMdataService;
import com.xudod.attendance.base_many_mdata.interfaces.vo.MdataGroupCodeInManyMdataVo;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "多键值码表数据功能接口", produces = "application/json", tags = "多键值码表数据功能接口")
@RestController
@RequestMapping("/api/baseManyMdata/")
public class BaseManyMdataController {

    @Autowired
    BaseManyMdataService baseManyMdataService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> add(@RequestBody BaseManyMdata pojo){
    	return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseManyMdataService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseManyMdataService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody BaseManyMdata pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseManyMdataService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<BaseManyMdata>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<BaseManyMdata>> (BaseResp.returnRes(200, baseManyMdataService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<BaseManyMdata>>> getpage(@RequestBody PageParameter<BaseManyMdata> page){
        return new ResponseEntity<BaseResp<IPage<BaseManyMdata>>> (
        	BaseResp.returnRes(200, baseManyMdataService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, baseManyMdataService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "getall", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<BaseManyMdata>>> getall(@RequestBody Object object){
        return new ResponseEntity<BaseResp<List<BaseManyMdata>>> (BaseResp.returnRes(200, baseManyMdataService.getAll(), "查询成功！"), HttpStatus.OK);
    }
    
	/*代码分界end TODO*/

    @ApiOperation(value = "根据分组code查询多键值码表信息", notes = "根据分组code查询多键值码表信息")
    @RequestMapping(value = "getmanymdata", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<BaseManyMdata>>> getmanymdata(@RequestBody MdataGroupCodeInManyMdataVo mdataGroupCodeVo){
        return new ResponseEntity<BaseResp<List<BaseManyMdata>>> (
        		BaseResp.returnRes(200, baseManyMdataService.getmanymdata(mdataGroupCodeVo), "查询成功！"), HttpStatus.OK);
    }

}

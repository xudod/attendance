package com.xudod.attendance.org_superior_relation.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.org_superior_relation.domain.entity.po.OrgSuperiorRelation;
import com.xudod.attendance.org_superior_relation.domain.service.OrgSuperiorRelationService;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "组织结构和其上级的关系表功能接口", produces = "application/json", tags = "组织结构和其上级的关系表功能接口")
@RestController
@RequestMapping("/api/orgSuperiorRelation/")
public class OrgSuperiorRelationController {

    @Autowired
    OrgSuperiorRelationService orgSuperiorRelationService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> add(@RequestBody OrgSuperiorRelation pojo){
    	return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, orgSuperiorRelationService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, orgSuperiorRelationService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody OrgSuperiorRelation pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, orgSuperiorRelationService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<OrgSuperiorRelation>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<OrgSuperiorRelation>> (BaseResp.returnRes(200, orgSuperiorRelationService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<OrgSuperiorRelation>>> getpage(@RequestBody PageParameter<OrgSuperiorRelation> page){
        return new ResponseEntity<BaseResp<IPage<OrgSuperiorRelation>>> (
        	BaseResp.returnRes(200, orgSuperiorRelationService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, orgSuperiorRelationService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "getall", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<OrgSuperiorRelation>>> getall(@RequestBody Object object){
        return new ResponseEntity<BaseResp<List<OrgSuperiorRelation>>> (
        	BaseResp.returnRes(200, orgSuperiorRelationService.getAll(), "查询成功！"), HttpStatus.OK);
    }
    
	/*代码分界end TODO*/



}

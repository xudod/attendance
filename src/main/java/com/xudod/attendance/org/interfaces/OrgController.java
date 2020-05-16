package com.xudod.attendance.org.interfaces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xudod.attendance.org.domain.entity.po.Org;
import com.xudod.attendance.org.domain.service.OrgService;
import com.xudod.attendance.org.interfaces.vo.OrgTreeQueryPramVo;
import com.xudod.attendance.org.interfaces.vo.OrgTreeVo;
import com.xudod.attendance.common.UpStateVo;
import com.xudod.attendance.common.BaseResp;
import com.xudod.attendance.common.OnlyId;
import com.xudod.attendance.common.PageParameter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by xudod on 2020/04/27.
 */
@Api(value = "组织机构表，来源于主数据功能接口", produces = "application/json", tags = "组织机构表，来源于主数据功能接口")
@RestController
@RequestMapping("/api/org/")
public class OrgController {

    @Autowired
    OrgService orgService;

	/*代码分界head TODO*/


    @ApiOperation(value = "新增一条数据", notes = "新增一条数据")
    @RequestMapping(value = "add", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<String>> add(@RequestBody Org pojo){
    	return new ResponseEntity<BaseResp<String>> (BaseResp.returnRes(200, orgService.add(pojo), "新增成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键删除一条数据", notes = "根据主键删除一条数据")
    @RequestMapping(value = "delbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> delbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, orgService.delbykey(pojo.getId()), "删除成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据主键更新一条数据", notes = "根据主键更新一条数据")
    @RequestMapping(value = "upbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upbykey(@RequestBody Org pojo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, orgService.upbykey(pojo), "更新成功！"), HttpStatus.OK);
    }
    
    @ApiOperation(value = "根据主键查询一条数据", notes = "根据主键查询一条数据")
    @RequestMapping(value = "getbykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Org>> getbykey(@RequestBody OnlyId pojo){
        return new ResponseEntity<BaseResp<Org>> (BaseResp.returnRes(200, orgService.getbykey(pojo.getId()), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "根据分页条件查询数据", notes = "根据分页条件查询数据")
    @RequestMapping(value = "getpage", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<IPage<Org>>> getpage(@RequestBody PageParameter<Org> page){
        return new ResponseEntity<BaseResp<IPage<Org>>> (BaseResp.returnRes(200, orgService.getpage(page), "查询成功！"), HttpStatus.OK);
    }

	@ApiOperation(value = "根据主键更新可用状态", notes = "根据主键更新可用状态")
    @RequestMapping(value = "upstatebykey", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<Integer>> upstatebykey(@RequestBody UpStateVo upStateVo){
        return new ResponseEntity<BaseResp<Integer>> (BaseResp.returnRes(200, orgService.upStatebykey(upStateVo), "更新成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "getall", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<Org>>> getall(@RequestBody Object object){
        return new ResponseEntity<BaseResp<List<Org>>> (BaseResp.returnRes(200, orgService.getAll(), "查询成功！"), HttpStatus.OK);
    }
    
	/*代码分界end TODO*/

    @ApiOperation(value = "查询所有数据", notes = "查询所有数据")
    @RequestMapping(value = "gettree", method=RequestMethod.POST, consumes= "application/json; charset=utf-8")
    ResponseEntity<BaseResp<List<Org>>> gettree(@RequestBody OrgTreeQueryPramVo orgTreeQueryPramVo){
        return new ResponseEntity<BaseResp<List<Org>>> (BaseResp.returnRes(200, orgService.getTree(orgTreeQueryPramVo), "查询成功！"), HttpStatus.OK);
    }

    @ApiOperation(value = "查询组织整树", notes = "查询组织整树")
    @RequestMapping(value = "getalltree", method=RequestMethod.POST)
    ResponseEntity<BaseResp<List<OrgTreeVo>>> getalltree(){
        return new ResponseEntity<BaseResp<List<OrgTreeVo>>> (BaseResp.returnRes(200, orgService.getalltree(), "查询成功！"), HttpStatus.OK);
    }

    

}

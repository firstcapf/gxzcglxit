package com.mryao.gxzcglxt.controller;

import com.mryao.gxzcglxt.entity.Cheak;
import com.mryao.gxzcglxt.entity.Projects;
import com.mryao.gxzcglxt.service.ICheakService;
import com.mryao.gxzcglxt.service.IProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/3 13:52
 * @Description:
 * @Version: 1.0
 */
@Api("审核")
@RestController
@RequestMapping("/cheak")
public class CheakController {
    @Autowired
    private ICheakService cheakService;

    @ApiOperation("添加")
    @PostMapping("/add")
    public Cheak addAsset(Cheak cheak){
        return cheakService.save(cheak);
    }

    @ApiOperation(value="展示")
    @GetMapping("/list")
    public List<Cheak> list(){
        return cheakService.findAll();
    }

    @ApiOperation(value ="修改")
    @PutMapping("/update")
    public Cheak updateUser(Cheak cheak){
        return cheakService.update(cheak);
    }

    @ApiOperation(value ="通过")
    @PutMapping("/pass")
    public Cheak pass(Cheak cheak){
        return cheakService.pass(cheak);
    }

    @ApiOperation(value ="未通过")
    @PutMapping("/notPass")
    public Cheak notPass(Cheak cheak){
        return cheakService.notPass(cheak);
    }


    @ApiOperation(value ="删除")
    @DeleteMapping("/delete")
    public void delete(Cheak cheak){
        cheakService.delete(cheak);
    }
}

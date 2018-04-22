package com.mryao.gxzcglxt.controller;

import com.mryao.gxzcglxt.entity.Assets;
import com.mryao.gxzcglxt.service.IAssetsService;
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
@Api("资产")
@RestController
@RequestMapping("/assets")
public class AssetsController {
    @Autowired
    private IAssetsService assetsService;

    @ApiOperation("添加新资产")
    @PostMapping("/add")
    public Assets addAsset(Assets assets){
        return assetsService.save(assets);
    }

    @ApiOperation(value="展示")
    @GetMapping("/list")
    public List<Assets> list(){
        return assetsService.findAll();
    }

    @ApiOperation(value ="修改")
    @PutMapping("/update")
    public Assets updateUser(Assets assets){
        return assetsService.update(assets);
    }

    @ApiOperation(value ="删除")
    @DeleteMapping("/delete")
    public void delete(Assets assets){
        assetsService.delete(assets);
    }
}

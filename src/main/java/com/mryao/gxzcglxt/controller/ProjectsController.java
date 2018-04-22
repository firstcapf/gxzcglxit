package com.mryao.gxzcglxt.controller;

import com.mryao.gxzcglxt.entity.Assets;
import com.mryao.gxzcglxt.entity.Projects;
import com.mryao.gxzcglxt.service.IAssetsService;
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
@Api("项目")
@RestController
@RequestMapping("/projects")
public class ProjectsController {
    @Autowired
    private IProjectService projectService;

    @ApiOperation("添加")
    @PostMapping("/add")
    public Projects addAsset(Projects projects){
        return projectService.save(projects);
    }

    @ApiOperation(value="展示")
    @GetMapping("/list")
    public List<Projects> list(){
        return projectService.findAll();
    }

    @ApiOperation(value="结果")
    @GetMapping("/result")
    public List<Projects> result(){
        return projectService.findResult();
    }

    @ApiOperation(value ="修改")
    @PutMapping("/update")
    public Projects updateUser(Projects projects){
        return projectService.update(projects);
    }

    @ApiOperation(value ="删除")
    @DeleteMapping("/delete")
    public void delete(Projects projects){
        projectService.delete(projects);
    }
}

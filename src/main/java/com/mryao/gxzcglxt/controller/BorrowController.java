package com.mryao.gxzcglxt.controller;

import com.mryao.gxzcglxt.entity.Assets;
import com.mryao.gxzcglxt.entity.BorrowList;
import com.mryao.gxzcglxt.service.IBorrowListService;
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
@Api("借出")
@RestController
@RequestMapping("/borrow")
public class BorrowController {
    @Autowired
    private IBorrowListService borrowListService;

    @ApiOperation("添加")
    @PostMapping("/add")
    public BorrowList add(BorrowList borrowList){
        return borrowListService.save(borrowList);
    }

    @ApiOperation(value="展示")
    @GetMapping("/list")
    public List<BorrowList> list(){
        return borrowListService.findAll();
    }

    @ApiOperation(value ="修改")
    @PutMapping("/update")
    public BorrowList updateUser(BorrowList borrowList){
        return borrowListService.update(borrowList);
    }

    @ApiOperation(value ="归还")
    @PutMapping("/return")
    public BorrowList returnAsset(BorrowList borrowList){
        return borrowListService.returnAsset(borrowList);
    }

    @ApiOperation(value ="删除")
    @DeleteMapping("/delete")
    public void delete(BorrowList borrowList){
        borrowListService.delete(borrowList);
    }
}

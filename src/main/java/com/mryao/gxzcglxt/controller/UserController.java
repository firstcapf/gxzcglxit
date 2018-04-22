package com.mryao.gxzcglxt.controller;

import com.mryao.gxzcglxt.entity.User;
import com.mryao.gxzcglxt.service.IUserService;
import com.mryao.gxzcglxt.utils.CookieUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/3/26 18:13
 * @Description:
 * @Version: 1.0
 */
@Api("用户")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value="注册")
    @PostMapping("/add")
    public User addUser(User user){
        return userService.save(user);
    }

    @ApiOperation(value="展示用户")
    @GetMapping("/list")
    public List<User> list(){
        return userService.findAll();
    }

    @ApiOperation(value ="登陆")
    @PostMapping("/login")
    public boolean login(User user, HttpServletResponse response){
        String userId = userService.findByUser(user);
        if("" == userId){
            return false;
        }else {
            Cookie cookie = new Cookie("_S",userId);
            response.addCookie(cookie);
            return true;
        }
    }

    @ApiOperation(value ="修改")
    @PutMapping("/update")
    public User updateUser(User user){
        return userService.update(user);
    }

    @ApiOperation(value ="删除")
    @DeleteMapping("/delete")
    public void delete(User user){
        userService.delete(user);
    }

    @ApiOperation(value = "登出")
    @GetMapping("/loginOut")
    public void loginOut(HttpServletResponse response){
        Cookie cookie = new Cookie("_S",null);
        response.addCookie(cookie);
    }

    @ApiOperation(value = "当前用户")
    @GetMapping("/currentUser")
    public User getCurrentUser(HttpServletResponse response, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        String userId = "";
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("_S")){
                userId = cookie.getValue();
            }
        }
        return userService.findById(userId);
    }
}

package com.mryao.gxzcglxt.service.Impl;

import com.mryao.gxzcglxt.dao.UserDao;
import com.mryao.gxzcglxt.entity.User;
import com.mryao.gxzcglxt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/2 21:47
 * @Description:
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        user.setCreateTime(new Date());
        return userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        List<User> all = userDao.findAll();
        return all;
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByName(username);
    }

    @Override
    public String findByUser(User user) {
        User back = userDao.findbyNameAndPassword(user.getUserName(),user.getPassword());
        if(null == back){
            return "";
        }else {
            return back.getId();
        }
    }

    @Override
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User findById(String userId) {
        return userDao.findById(userId);
    }
}

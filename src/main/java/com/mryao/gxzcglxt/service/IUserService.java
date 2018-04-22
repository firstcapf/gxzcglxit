package com.mryao.gxzcglxt.service;

import com.mryao.gxzcglxt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/3/26 18:17
 * @Description:
 * @Version: 1.0
 */
public interface IUserService  {
    User save(User user);

    List<User> findAll();

    User findByUsername(String username);

    String findByUser(User user);

    User update(User user);

    void delete(User user);

    User findById(String userId);
}

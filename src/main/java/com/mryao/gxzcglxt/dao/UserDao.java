package com.mryao.gxzcglxt.dao;

import com.mryao.gxzcglxt.entity.User;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * @author: yaohuaiying
 * @Date: 2018/3/26 18:39
 * @Description:
 * @Version: 1.0
 */
public interface UserDao extends JpaRepository<User, Long> {
    @Query("select u from User u where u.userName = :name")
    User findByName(@Param("name")String username);

    @Query("select u from User u where u.userName = :name and u.password = :password" )
    User findbyNameAndPassword(@Param("name") String userName, @Param("password") String password);

    @Query("select u from User u where u.id = :id")
    User findById(@Param("id") String userId);
}

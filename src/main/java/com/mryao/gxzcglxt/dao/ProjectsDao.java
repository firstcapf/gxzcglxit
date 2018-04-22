package com.mryao.gxzcglxt.dao;

import com.mryao.gxzcglxt.entity.Assets;
import com.mryao.gxzcglxt.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/3/26 18:39
 * @Description:
 * @Version: 1.0
 */
public interface ProjectsDao extends JpaRepository<Projects, Long> {

    @Modifying
    @Query("update Projects set status = :status where id = :id ")
    void updateBorrowed(@Param("id") String id, @Param("status") String status);

    @Query("select u from Projects u where u.id = :id")
    Projects findbyId(@Param("id") String projectsId);

    @Query("select u from Projects u where u.status = '通过'")
    List<Projects> findResult();

}

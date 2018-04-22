package com.mryao.gxzcglxt.dao;

import com.mryao.gxzcglxt.entity.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.StyledEditorKit;

/**
 * @author: yaohuaiying
 * @Date: 2018/3/26 18:39
 * @Description:
 * @Version: 1.0
 */
public interface AssetsDao extends JpaRepository<Assets, Long> {

    @Modifying
    @Query("update Assets set isBorrowed = :isborrowed, usePeople = :userName where id = :id ")
    void updateBorrowed(@Param("id") String assetsId,
                        @Param("isborrowed") boolean isborrowed,
                        @Param("userName") String userName);
}

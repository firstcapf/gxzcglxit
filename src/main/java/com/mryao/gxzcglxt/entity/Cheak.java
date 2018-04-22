package com.mryao.gxzcglxt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/2 22:35
 * @Description:
 * @Version: 1.0
 */
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "cheak")
public class Cheak extends BaseEntity {

    @Column(name = "projectsId")
    private String projectsId;

    @Column(name = "name")
    private String name;

    @Column(name = "performance")
    private String performance;

    @Column(name = "pass")
    private String pass;

    @Column(name = "manager")
    private String manager;

    public String getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(String projectsId) {
        this.projectsId = projectsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}

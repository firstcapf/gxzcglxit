package com.mryao.gxzcglxt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/2 22:06
 * @Description:
 * @Version: 1.0
 */
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "projects")
public class Projects extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "manager")
    private String manager;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "createTime")
    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

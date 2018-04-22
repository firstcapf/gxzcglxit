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
@Table(name = BaseEntity.TABLE_PREFIX + "assets")
public class Assets extends BaseEntity{

    //资产名字
    @Column(name = "name")
    private String name;

    //负责人
    @Column(name = "principal")
    private String principal;

    //种类
    @Column(name = "type")
    private String type;

    //是否借出
    @Column(name = "isBorrowed")
    private boolean isBorrowed;

    //使用者
    @Column(name = "usePeople")
    private String usePeople;

    //资产状态
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

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getUsePeople() {
        return usePeople;
    }

    public void setUsePeople(String usePeople) {
        this.usePeople = usePeople;
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
}

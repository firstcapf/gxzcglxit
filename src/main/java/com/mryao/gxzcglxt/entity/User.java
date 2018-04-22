package com.mryao.gxzcglxt.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/3/26 18:07
 * @Description:
 * @Version: 1.0
 */
@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "USER")
public class User extends BaseEntity{


    //用户名
    @Column(name = "name")
    private String userName;

    //密码
    @Column(name = "password")
    private String password;

    //用户类型
    @Column(name = "type")
    private String type;

    //创建时间
    @Column(name = "createTime")
    private Date createTime;

    @Column(name = "description")
    private String description;

    @Column(name = "phone")
    private String phone;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

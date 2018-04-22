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
@Table(name = BaseEntity.TABLE_PREFIX + "borrowlist")
public class BorrowList extends BaseEntity {

    //资产Id
    @Column(name = "assetId")
    private String assetId;

    //资产名字
    @Column(name = "assetsName")
    private String assetsName;

    //使用者名字
    @Column(name = "userName")
    private String userName;

    //描述
    @Column(name = "description")
    private String description;

    //借出时间
    @Column(name = "borrowTime")
    private String borrowTime;

    //归还时间
    @Column(name = "retrunTime")
    private String retrunTime;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getAssetsId() {
        return assetId;
    }

    public void setAssetsId(String assetsId) {
        this.assetId = assetsId;
    }

    public String getRetrunTime() {
        return retrunTime;
    }

    public void setRetrunTime(String retrunTime) {
        this.retrunTime = retrunTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

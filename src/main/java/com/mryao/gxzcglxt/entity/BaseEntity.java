package com.mryao.gxzcglxt.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author: yaohuaiying
 * @Date: 2018/3/26 18:08
 * @Description:
 * @Version: 1.0
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    public static final String TABLE_PREFIX = "t_";

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

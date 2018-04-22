package com.mryao.gxzcglxt.service;

import com.mryao.gxzcglxt.entity.Assets;
import com.mryao.gxzcglxt.entity.Projects;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/3 13:27
 * @Description:
 * @Version: 1.0
 */
public interface IProjectService {

    Projects save(Projects projects);

    List<Projects> findAll();

    Projects update(Projects projects);

    void delete(Projects projects);

    List<Projects> findResult();

}

package com.mryao.gxzcglxt.service.Impl;

import com.mryao.gxzcglxt.dao.AssetsDao;
import com.mryao.gxzcglxt.dao.ProjectsDao;
import com.mryao.gxzcglxt.entity.Assets;
import com.mryao.gxzcglxt.entity.Projects;
import com.mryao.gxzcglxt.service.IAssetsService;
import com.mryao.gxzcglxt.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/3 13:28
 * @Description:
 * @Version: 1.0
 */
@Service
public class ProjectsServiceImpl implements IProjectService {

    @Autowired
    private ProjectsDao projectsDao;

    @Override
    public Projects save(Projects projects) {
        projects.setStatus("初始化");
        projects.setCreateTime(new Date());
        return projectsDao.save(projects);
    }

    @Override
    public List<Projects> findAll() {
        return projectsDao.findAll();
    }

    @Override
    public Projects update(Projects projects) {
        return projectsDao.save(projects);
    }

    @Override
    public void delete(Projects projects) {
        projectsDao.delete(projects);
    }

    @Override
    public List<Projects> findResult() {
        return projectsDao.findResult();
    }
}

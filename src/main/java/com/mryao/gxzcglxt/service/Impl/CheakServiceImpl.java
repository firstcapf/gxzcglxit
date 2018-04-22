package com.mryao.gxzcglxt.service.Impl;

import com.mryao.gxzcglxt.dao.AssetsDao;
import com.mryao.gxzcglxt.dao.BorrowListDao;
import com.mryao.gxzcglxt.dao.CheakDao;
import com.mryao.gxzcglxt.dao.ProjectsDao;
import com.mryao.gxzcglxt.entity.BorrowList;
import com.mryao.gxzcglxt.entity.Cheak;
import com.mryao.gxzcglxt.entity.Projects;
import com.mryao.gxzcglxt.service.IBorrowListService;
import com.mryao.gxzcglxt.service.ICheakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/3 13:29
 * @Description:
 * @Version: 1.0
 */
@Service
public class CheakServiceImpl implements ICheakService {

    @Autowired
    private CheakDao cheakDao;

    @Autowired
    private ProjectsDao projectsDao;


    @Override
    @Transactional
    public Cheak save(Cheak cheak) {
        Projects projects = projectsDao.findbyId(cheak.getProjectsId());
        projects.setStatus("审核中");
        projectsDao.save(projects);
        cheak.setPass("未审核");
        return cheakDao.save(cheak);
    }

    @Override
    public List<Cheak> findAll() {
        return cheakDao.findAll();
    }

    @Override
    public Cheak update(Cheak cheak) {
        return cheakDao.save(cheak);
    }

    @Override
    public void delete(Cheak cheak) {
        cheakDao.delete(cheak);
    }

    @Transactional
    @Override
    public Cheak pass(Cheak cheak) {
        Projects projects = projectsDao.findbyId(cheak.getProjectsId());
        projects.setStatus("通过");
        projectsDao.save(projects);
        return cheakDao.save(cheak);
    }

    @Override
    @Transactional
    public Cheak notPass(Cheak cheak) {
        Projects projects = projectsDao.findbyId(cheak.getProjectsId());
        projects.setStatus("未通过");
        projectsDao.save(projects);
        return cheakDao.save(cheak);    }
}

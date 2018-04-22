package com.mryao.gxzcglxt.service.Impl;

import com.mryao.gxzcglxt.dao.AssetsDao;
import com.mryao.gxzcglxt.entity.Assets;
import com.mryao.gxzcglxt.service.IAssetsService;
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
public class AssetsServiceImpl implements IAssetsService {

    @Autowired
    private AssetsDao assetsDao;

    @Override
    public Assets save(Assets assets) {
        assets.setIsBorrowed(false);
        assets.setStatus("正常");
        assets.setUsePeople("无");
        assets.setCreateTime(new Date());
        return assetsDao.save(assets);
    }

    @Override
    public List<Assets> findAll() {
        return assetsDao.findAll();
    }

    @Override
    public Assets update(Assets assets) {
        return assetsDao.save(assets);
    }

    @Override
    public void delete(Assets assets) {
        assetsDao.delete(assets);
    }
}

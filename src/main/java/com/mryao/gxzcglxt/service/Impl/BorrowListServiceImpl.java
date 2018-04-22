package com.mryao.gxzcglxt.service.Impl;

import com.mryao.gxzcglxt.dao.AssetsDao;
import com.mryao.gxzcglxt.dao.BorrowListDao;
import com.mryao.gxzcglxt.entity.BorrowList;
import com.mryao.gxzcglxt.service.IBorrowListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/3 13:29
 * @Description:
 * @Version: 1.0/
 */
@Service
public class BorrowListServiceImpl implements IBorrowListService {

    @Autowired
    private BorrowListDao borrowListDao;

    @Autowired
    private AssetsDao assetsDao;

    @Override
    @Transactional
    public BorrowList save(BorrowList borrowList) {
        assetsDao.updateBorrowed(borrowList.getAssetsId(),true,borrowList.getUserName());
        SimpleDateFormat lsdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        borrowList.setBorrowTime(lsdFormat.format(new Date()));
        return borrowListDao.save(borrowList);
    }

    @Override
    public List<BorrowList> findAll() {
        return borrowListDao.findAll();
    }

    @Override
    public BorrowList update(BorrowList borrowList) {
        return borrowListDao.save(borrowList);
    }

    @Override
    public void delete(BorrowList borrowList) {
        borrowListDao.delete(borrowList);
    }

    @Override
    @Transactional
    public BorrowList returnAsset(BorrowList borrowList) {
        assetsDao.updateBorrowed(borrowList.getAssetsId(),false,"无");
        SimpleDateFormat lsdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        borrowList.setRetrunTime(lsdFormat.format(new Date()));
        return borrowListDao.save(borrowList);
    }
}

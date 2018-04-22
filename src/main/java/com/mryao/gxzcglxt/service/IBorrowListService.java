package com.mryao.gxzcglxt.service;

import com.mryao.gxzcglxt.entity.Assets;
import com.mryao.gxzcglxt.entity.BorrowList;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/3 13:29
 * @Description:
 * @Version: 1.0
 */
public interface IBorrowListService {
    BorrowList save(BorrowList borrowList);

    List<BorrowList> findAll();

    BorrowList update(BorrowList borrowList);

    void delete(BorrowList borrowList);

    BorrowList returnAsset(BorrowList borrowList);
}

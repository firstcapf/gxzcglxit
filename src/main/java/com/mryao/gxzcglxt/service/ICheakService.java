package com.mryao.gxzcglxt.service;

import com.mryao.gxzcglxt.entity.BorrowList;
import com.mryao.gxzcglxt.entity.Cheak;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/3 13:29
 * @Description:
 * @Version: 1.0
 */
public interface ICheakService {
    Cheak save(Cheak cheak);

    List<Cheak> findAll();

    Cheak update(Cheak cheak);

    void delete(Cheak cheak);

    Cheak pass(Cheak cheak);

    Cheak notPass(Cheak cheak);
}

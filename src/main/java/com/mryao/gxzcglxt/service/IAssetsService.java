package com.mryao.gxzcglxt.service;

import com.mryao.gxzcglxt.entity.Assets;

import java.util.List;

/**
 * @author: yaohuaiying
 * @Date: 2018/4/3 13:27
 * @Description:
 * @Version: 1.0
 */
public interface IAssetsService {

    Assets save(Assets assets);

    List<Assets> findAll();

    Assets update(Assets assets);

    void delete(Assets assets);

}

package com.mall.demo.service;

import com.mall.demo.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/7/22 13:18
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}

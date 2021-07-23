package com.mall.demo.dao;

import com.mall.demo.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/7/23 15:55
 * @description 搜索系统中的商品管理自定义Dao
 */
@Repository
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}

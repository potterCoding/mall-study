package com.mall.demo.service;

import com.mall.demo.common.api.CommonResult;
import com.mall.demo.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/7/24 10:49
 * @description 前台订单管理Service
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}

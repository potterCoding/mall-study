package com.mall.demo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/7/24 10:50
 */
@Getter
@Setter
public class OrderParam {
    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;
}

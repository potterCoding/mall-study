package com.mall.demo.service;

import com.mall.demo.common.api.CommonResult;

/**
 * @author: sql
 * @date: 2021/7/23 10:58
 * @version 1.0.0
 * @description 会员管理Service
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}

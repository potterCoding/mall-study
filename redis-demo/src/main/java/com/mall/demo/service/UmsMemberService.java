package com.mall.demo.service;

import com.mall.demo.common.CommonResult;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/7/23 9:53
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

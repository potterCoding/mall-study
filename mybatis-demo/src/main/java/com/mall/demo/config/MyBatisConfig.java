package com.mall.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/7/22 13:14
 * @description 用于配置需要动态生成的mapper接口的路径
 */
@Configuration
@MapperScan("com.mall.demo.mbg.mapper")
public class MyBatisConfig {
}

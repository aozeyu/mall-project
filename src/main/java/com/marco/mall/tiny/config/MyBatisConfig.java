package com.marco.mall.tiny.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.marco.mall.tiny.mbg.mapper")
public class MyBatisConfig {

}

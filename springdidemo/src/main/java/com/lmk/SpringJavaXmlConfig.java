package com.lmk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author LiuMengKe
 * @create 2018-06-30-21:36
 * spring
 * 测试混合模式 config 与 xml 进行混合
 * 导入其他配置类 @Import
 * 导入xml配置@ImportResource
 */
@Configuration
@Import(SpringJavaConfig2.class)
@ImportResource("classpath:springloc.xml")
public class SpringJavaXmlConfig {
}

package com.lmk;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LiuMengKe
 * @create 2018-06-30-21:30
 */
@Configuration
@Import({SpringJavaConfig.class,SpringJavaConfig2.class})
public class SpringJavaConfigAll {
}

package com.lmk;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.stereotype.Component;

/**
 * DelegatingFilterProxy 对应spring环境类
 *
 * @author LiuMengKe
 * @create 2018-07-11-10:43
 *
 *如果你希望借助WebApplicationInitializer以Java的方式来配
 * 置Delegating-FilterProxy的话
 * AbstractSecurityWebApplicationInitializer实现了
 * WebApplicationInitializer，因此Spring会发现它，并用它
 * 在Web容器中注册DelegatingFilterProxy
 * 不管我们通过web.xml还是通过
 * AbstractSecurityWebApplicationInitializer的子类来配
 * 置DelegatingFilterProxy，它都会拦截发往应用中的请求，并
 * 将请求委托给ID为springSecurityFilterChain bean。
 *
 *
 */
@Order(2)
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer {


}

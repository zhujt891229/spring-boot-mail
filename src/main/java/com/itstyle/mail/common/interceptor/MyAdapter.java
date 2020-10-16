package com.itstyle.mail.common.interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * 配置首页(在SpringBoot2.0及Spring 5.0 WebMvcConfigurerAdapter以被废弃,建议实现WebMvcConfigurer接口)
 * 创建者 小柒2012
 * 创建时间	2017年9月7日
 */
@Configuration
public class MyAdapter implements WebMvcConfigurer {

    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        registry.addViewController( "/" ).setViewName( "forward:/login.shtml" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
    }
}


package com.lqf.fleamarket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description detail
 * Created by lqf on 2021/5/14 10:19
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    // 拦截请求访问本地资源
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/images/commodities/**").addResourceLocations("file:D:/fleaMarketTempImg/commodities/");
        registry.addResourceHandler("/api/images/users/**").addResourceLocations("file:D:/fleaMarketTempImg/users/");
    }
}

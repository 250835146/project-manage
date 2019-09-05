package com.example.projectwebapiqicai.config;


import com.example.projectwebapiqicai.interceptor.LoginCheckInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 配置静态资源，比如html，js，css，等等
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器，写好的拦截器需要通过这里添加注册才能生效

// 添加拦截的请求，并排除几个不拦截的请求
        registry.addInterceptor(new LoginCheckInterceptor())
                .addPathPatterns("/**")
                //不被拦截接口
                .excludePathPatterns("/api/v2/operation/getUserId");
    }
}

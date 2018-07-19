package com.charl.blog.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: blog
 * @description:
 * @author: charl
 * @create: 2018-07-19 17:25
 **/
@Configuration
public class DruidConfig {

    //非常简单的配置druid数据库连接池
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Bean
    public DataSource druid(){
        return  new DruidDataSource();
    }

    //下面的1和2是配置Druid的监控
    //1、配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");//登录druid监控的账户
        initParams.put("loginPassword","777777");//登录druid监控的密码
        initParams.put("allow","");//默认就是允许所有访问
        initParams.put("deny","192.168.15.21");//黑名单的IP

        bean.setInitParameters(initParams);
        return bean;
    }
    //2、配置一个web监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.css,/druid/*");

        bean.setInitParameters(initParams);

        bean.setUrlPatterns(Arrays.asList("/*"));

        return  bean;
    }


}

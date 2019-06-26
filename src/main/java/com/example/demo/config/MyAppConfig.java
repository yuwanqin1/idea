package com.example.demo.config;

import com.example.demo.server.HelloServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
* spring boot：推荐使用该方法
 * @Configuration:指明当前类是一个配置类，就是来代替之前的spring配置文件（将配置文件:将类中变量全局化）
 *
 * 在配置文件中用<bean></bean>标签添加组件
* */
@Configuration
public class MyAppConfig {
    //将方法的返回值添加到容器中，容器中的这个组件默认的id就是方法名
    @Bean
    public HelloServer helloServer(){
        System.out.println("官网推荐配置@Bean给容器中添加组件");
        return new HelloServer();
    }
}

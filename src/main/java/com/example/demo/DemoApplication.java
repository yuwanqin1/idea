package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * resources：文件夹中的目录结构
 *      static：保存所有的静态文件夹: js css img
 *      templates:保存所有的模板页面:(spring boot默认的jar包使用嵌入式的Tomcat,默认不支持jsp页面)
 *          但是可以使用模板引擎(freemarker, thymeleaf)
 *      applicatoion.properties：spring boot引用的配置文件
 * */

/**
 * 全局注册文件,只有这两个固定的文件
 * application.properties
 * application.yml:以数据为中心比json,xml更好
 * */

@ImportResource(locations = "{classpath: beans.xml}")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

package com.example.demo;

import com.example.demo.bean.Person;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * spring boot的单元测试：
 * 	可以在测试期间很方便的类似编码的自动注入
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	//拿到组件@Component+@ConfigurationProperties(prefix = "person")注入的值
	@Autowired
	Person person;

	@Autowired
    ApplicationContext ioc;

	@Test
	public void contextLoads() {
//	    打印b变量访问自定义配置文件的数据
//        直接答应为false: 直接访问访问不打到 相应的数据
//	    boolean b = ico.containsBean('helloServer');
//        boolean b = ioc.contaisBean("helloServer");
		System.out.println(person);
	}

}

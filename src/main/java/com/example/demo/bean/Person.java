package com.example.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties:告诉spring boot将本类中的所有的属性和配置文件中相关的配置进行绑定
 *      prefix：只有这个组件是容器中的组件，才能给容器提供@ConfigurationProperties功能
 * @Component：将值注入带组件中
 * */

@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    /**
     * 类似与配置文件变量注入
     * 方法1:
     * <bean>
     *     <property name="name" value="字面量#{变量}"></property>
     * </bean>
     * 方法2: @value("name")
     * 变量为: lastName @value("last-name")
     *
     * 总结:
     * 如果说我们只是在某一个业务逻辑中需要获取一下配置文件中的某一项值，使用@value()
     * 如果我们我们专门编写了一个JavaBean来配置文件进行映射，我们就直接使用@ConfigurationProperties
     * 简而言之：操作少数的用@value,多数的用@ConfigurationProperties
    * */

    private String name;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dogs;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dogs=" + dogs +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDogs() {
        return dogs;
    }

    public void setDogs(Dog dogs) {
        this.dogs = dogs;
    }
}

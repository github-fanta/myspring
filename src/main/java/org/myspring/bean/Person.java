package org.myspring.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    // 使用@Value相当于使用XML配值文件中的 初始值指定<property name="name" value="zhangsan"/>中的 value
    // 1. 使用@Value赋值
    // 2. 可以使用SpEL; #{}
    // 3. 可以写${}; 取出配置文件中的值(在运行环境变量里面的值)
    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private Integer age;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    @Value("${person.nickName}")
    private String nickName;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}

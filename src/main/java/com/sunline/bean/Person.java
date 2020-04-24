package com.sunline.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author yanbinfeng
 * @date 2020/4/8- 12:13
 */
public class Person {
    @Value("张三")
    private String name;
    @Value("#{22-1}")
    private Integer age;

    @Value("${mess}")
    private  String mess;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mess='" + mess + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}

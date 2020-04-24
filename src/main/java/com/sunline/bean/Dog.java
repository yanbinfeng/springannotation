package com.sunline.bean;

import org.springframework.context.annotation.Bean;

/**
 * @author yanbinfeng
 * @date 2020/4/10- 19:19
 */

public class Dog {


    public Dog(){
        System.out.println("构造器======");

    }

    public void init(){
        System.out.println("初始化方法=====init");
    }

    public void destory(){
        System.out.println("销毁方法======destory");
    }

}

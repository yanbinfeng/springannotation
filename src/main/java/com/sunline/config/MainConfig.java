package com.sunline.config;

import com.sunline.bean.Person;
import com.sunline.com.sunline.condition.MyPersonComdition;
import com.sunline.com.sunline.condition.condition.LinuxCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanbinfeng
 * @date 2020/4/9- 15:04
 */
@Configuration
public class MainConfig {

    @Bean("person")
    @Conditional(LinuxCondition.class)
    public Person person(){

        return  new Person("张三",88);
    }

}

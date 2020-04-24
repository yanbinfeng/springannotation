package com.sunline.config;

import com.sunline.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author yanbinfeng
 * @date 2020/4/14- 13:42
 */
@PropertySource(value="classpath:person.properties")
@Configuration
public class PropertyOfValue {

    @Bean
    public Person person(){

        return new Person();
    }
}

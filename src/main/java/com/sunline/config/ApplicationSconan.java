package com.sunline.config;

import com.sunline.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author yanbinfeng
 * @date 2020/4/8- 14:30
 */
@Configuration
@ComponentScans(value={
        @ComponentScan(basePackages = {"com.sunline"},includeFilters={
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = MyTypeFilter.class)
},useDefaultFilters=false)
})
public class ApplicationSconan {
    @Scope
    @Bean(value="Person01")
    public Person getPerson(){

        return  new Person("zhangsan",22);
    }

}

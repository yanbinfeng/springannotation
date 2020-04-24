package com.sunline.com.sunline.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author yanbinfeng
 * @date 2020/4/9- 15:08
 */

public class MyPersonComdition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        System.out.println("beanFactory"+beanFactory);
        ClassLoader classLoader = conditionContext.getClassLoader();
        System.out.println("classLoader"+classLoader);
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        System.out.println("registry"+registry);
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println("property============="+property);
        if(property.contains("Windows")){
            return true;
        }
        return false;
    }
}

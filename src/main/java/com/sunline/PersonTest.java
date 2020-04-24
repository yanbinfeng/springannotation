package com.sunline;

import com.sunline.bean.Person;
import com.sunline.config.ApplicationSconan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yanbinfeng
 * @date 2020/4/8- 14:20
 */
public class PersonTest {
    public static void main(String[] args) {
       /* ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person)ap.getBean("Person");
        Integer age = person.getAge();
        String name = person.getName();
        System.out.println(age+name);*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationSconan.class);
        Person getperson =(Person) applicationContext.getBean(Person.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String str : beanNamesForType){

            System.out.println(str.length());
        }

    }
}

import com.sunline.bean.Person;
import com.sunline.config.ApplicationSconan;
import com.sunline.config.MainConfig;
import com.sunline.config.PropertyOfValue;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author yanbinfeng
 * @date 2020/4/8- 18:12
 */
public class PropertyOfValueTest {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyOfValue.class);
    @Test
    public  void test02(){
      test01(applicationContext);
        Person bean = (Person)applicationContext.getBean(Person.class);
        System.out.println(bean);
    }


    public void test01(ApplicationContext applicationContext){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String str : beanDefinitionNames){
            System.out.println(str);

        }
    }
}

import com.sunline.bean.Person;
import com.sunline.config.ApplicationSconan;
import com.sunline.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.NameAlreadyBoundException;
import java.util.Map;

/**
 * @author yanbinfeng
 * @date 2020/4/8- 18:12
 */
public class PersonTest {
    @Test
    public void test(){
        int[] nums = {1,1,2};
        test03(nums);
    }

    public void test03(int[] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i+1];
                count++;
            }
        }
        Integer renum = (nums.length-count);
        System.out.println("剩下的长度为"+renum.toString());
    }
    @Test
    public  void test02(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println("共有：======="+beansOfType);
        for(String name : namesForType){

            System.out.println("name:========"+name);
        }
        for (String str : beanDefinitionNames){
            System.out.println("str======"+str);

        }
    }

    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationSconan.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String str : beanDefinitionNames){
            System.out.println(str);

        }
    }
}

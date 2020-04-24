import com.sunline.MyThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author yanbinfeng
 * @date 2020/4/20- 16:14
 */
public class MyThreadTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0;i<10;i++){
            executorService.execute(new MyThread());
        }
        Future<?> submit = executorService.submit(new MyThread());
        System.out.println("submit=======>"+submit);
    }
}
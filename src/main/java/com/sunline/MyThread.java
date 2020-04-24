package com.sunline;

/**
 * @author yanbinfeng
 * @date 2020/4/20- 16:12
 */
public class MyThread  implements Runnable{
    public void run() {
        try{
            Thread.sleep(3000);
            System.out.println("延时一秒");
        }catch (Exception e){

        }
    }
}

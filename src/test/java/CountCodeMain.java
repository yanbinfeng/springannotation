import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yanbinfeng
 * @date 2020/4/17- 17:12
 */
public class CountCodeMain {
    int[] num =new int[2];
    public int[] twoSum(int[] nums, int target) {
        int i =0;
        for(i =0;i<nums.length;i++){

            for(int j=1+i;j<nums.length;j++){
                if((nums[i]+nums[j])==target){

                    System.out.println();
                    for(int x = 0 ; x<num.length;x++){
                        num[x]=i;
                        num[x]=j;
                    }
                    return num;
                }

            }
        }

        return num;
    }

        private AtomicInteger firstJobDone = new AtomicInteger(0);
        private AtomicInteger secondJobDone = new AtomicInteger(0);

        public CountCodeMain() {}

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first".
            printFirst.run();
            // mark the first job as done, by increasing its count.
            firstJobDone.incrementAndGet();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (firstJobDone.get() != 1) {
                // waiting for the first job to be done.
            }
            // printSecond.run() outputs "second".
            printSecond.run();
            // mark the second as done, by increasing its count.
            secondJobDone.incrementAndGet();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (secondJobDone.get() != 1) {
                // waiting for the second job to be done.
            }
            // printThird.run() outputs "third".
            printThird.run();
        }

    public static void main(String[] args) {



    }






}

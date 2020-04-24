/**
 * @author yanbinfeng
 * @date 2020/4/13- 12:42
 */
public class MyMain {
    public static  void main(String[] strings){
        int[] nums = {1,1,2};
        test03(nums);
    }

    public static void test03(int[] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            System.out.println("aaaa");
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i+1];
                count++;
            }
        }
        Integer renum = (nums.length-count);
        System.out.println("剩下的长度为"+renum.toString());
    }
}

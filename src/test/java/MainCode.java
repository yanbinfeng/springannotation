

/**
 * @author yanbinfeng
 * @date 2020/4/17- 19:52
 */
public class MainCode {
   static int[] num = new int[2];
   int aa = 0;
   int bb = 0;
    public static int[] twoSum(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){

            for(int j=1+i;j<nums.length;j++){
                if( nums[i]+nums[j]==target){
                    System.out.println(i+j);
                    for(int x = 0 ; x<num.length;x++){
                            if(x==0){

                                num[x]=i;
                            }else{

                                num[x]=j;
                            }
                    }
                    return num;

                }

            }
        }


        return num;
    }
    public static void main(String[] args) {



        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        for(int i = 0;i<ints.length;i++){
            System.out.println("======="+ints[i]);
        }
    }
}

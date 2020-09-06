package Array;

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int res = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
           if (res<=0){
               res = nums[i];
           }else{
               res += nums[i];
           }
           max = Math.max(res,max);
        }
        return max;
    }
}

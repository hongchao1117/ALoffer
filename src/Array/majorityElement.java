package Array;

import java.util.Arrays;

public class majorityElement {
    public int majorityElement(int[] nums) {
        int res = 0,count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count==0){
                res = nums[i];
                count++;
            }else {
                if (res == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return res;
    }
}

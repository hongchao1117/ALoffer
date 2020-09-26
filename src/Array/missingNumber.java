package Array;

import java.util.Arrays;

public class missingNumber {
    public int missingNumber(int[] nums) {
//        int l = 0, r = nums.length - 1;
//        while (l<=r){
//            int mid = (l+r)/2;
//             if (nums[mid]==mid)
//                l = mid+1;
//             else
//                 r = mid -1;
//        }
//        return l ;
        int sum = nums.length* (nums.length+1)/2;
        return sum - Arrays.stream(nums).sum();
    }
}

package Array;

import java.util.HashSet;
import java.util.Set;

public class findRepeatNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 0, 2, 5, 3};
        int num = findRepeatNum(arr);
        System.out.println(num);
    }

    private static int  findRepeatNum(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]]>1) return nums[i];
        }
        return -1;

    }
}

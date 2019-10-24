package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxSlidingWindow {
    public static void main(String[] args) {
        int [] num = {2,3,4,2,6,2,5,1};
        int size = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(num,size)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0 || k==0)
            return nums;
        int[] arr = new int[nums.length-k+1];
        List<Integer> list = new ArrayList<>();
        int len = k;
        for(int i=0;i<nums.length-k+1;i++){
            for (int j = i; j <len ; j++) {
                list.add(nums[j]);
            }
            len++;
            int temp = Collections.max(list);
            arr[i] = temp;
            list = new ArrayList<Integer>();
        }
        return arr;
    }
}

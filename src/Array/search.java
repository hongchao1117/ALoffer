package Array;

public class search {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(search(nums,8));

    }
    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length-1,count =0;
        if(nums[l]>target || nums[r]<target)
            return 0;
        while (l<r) {
            int mid = (l+r)/2;
            if (nums[mid] >= target) {
                r = mid ;
            } else if (nums[mid] < target) {
                l = mid+1;
            }
        }
        while(l<nums.length&&nums[l++]==target)
            count++;

        return count;
    }
}

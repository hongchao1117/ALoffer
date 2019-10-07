package Array;

//数组的最大连续子序列和
public class MaxContinueArraySum {
    public int MaxContinueArraySum(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int sum = arr[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum+arr[i],arr[i]);
            if (sum>=max)
                max = sum;
        }
        return max;
    }
}

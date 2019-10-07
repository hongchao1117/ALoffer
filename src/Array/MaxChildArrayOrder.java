package Array;

//数组最大不连续递增子序列
public class MaxChildArrayOrder {
    public int MaxChildArrayOrder(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];//用于储存最长子序列
        for (int i = 0; i < n; i++) {
            temp[i] = 1;//初始值都为1
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j] && temp[j]+1>temp[i]){
                    temp[i] = temp[j] +1;
                }
            }
        }
        int max = temp[0];
        //从temp数组里取出最大的值
        for (int i = 1; i < n; i++) {
            if (temp[i]>max)
                max = temp[i];
        }
        return max;
    }
}

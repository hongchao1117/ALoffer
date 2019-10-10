package Array;

import java.util.Arrays;

public class move0 {
    public static void main(String[] args) {
        int[] arr = {2,92,0,0,93,0};
        moveNum(arr);
    }

    public static void moveNum(int[] arr){
        int count = 0;//记录0的个数
        for (int x:arr){
            if (x==0) {
                count++;
            }
        }
        int index = arr.length-count;//数组中非0的个数
        for (int i = 0; i < index; i++) {
            if (arr[i]==0){
                int j =i+1;
                while (arr[j]==0){
                    j++;
                }
                arr[i] = arr[j];
//                arr[j] = 0;
            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

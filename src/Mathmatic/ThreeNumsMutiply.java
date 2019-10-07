package Mathmatic;

import java.util.Scanner;

public class ThreeNumsMutiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        System.out.println( largestMul(array, n));
    }

    public static long largestMul(long[] num, int length) {
        long max1 = 0, max2 = 0, max3 = 0, min1 = 0, min2 = 0;
        //利用o(n)的时间复杂度找3个最大值和2个最小值
        for (int i = 0; i < length; i++) {
            if (num[i] != 0) {
                if (num[i] > max1) {//max1是最大值，max2是次大值，max3是次次大值；如果有元素比最大值大，则所有的值全部更改
                    max3 = max2;
                    max2 = max1;
                    max1 = num[i];
                } else if (num[i] > max2) {//如果有元素比次大值大，但是比最大值小；即更改次大值和次次大值
                    max3 = max2;
                    max2 = num[i];
                } else if (num[i] > max3) {//如果有元素比次次大值大，但是比最大值和次大值都小的话，只更改次次大值
                    max3 = num[i];
                } else if (num[i] < min1) {//方法同上，找到两个最小值
                    min2 = min1;
                    min1 = num[i];
                } else if (num[i] > min1 && num[i] < min2) {
                    min2 = num[i];
                }
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
}
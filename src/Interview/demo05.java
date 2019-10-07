package Interview;

import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//格子的数量
        int[] arr = new int[n];//血量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                if (arr[2*i+1]!=0){
                    sum = arr[2*i+1];
                    arr[2*i+1]=0;
                    continue;
                }
            }else{
                if (arr[i]!=0){
                    int temp;
                    int min;
                    if (arr[i]>arr[2*i]){
                         temp = arr[2*i];
                    }else{
                        temp = arr[i];
                    }
                    if (temp>arr[2*i]){
                        temp = arr[2*i];
                    }else{
                        temp = arr[i];
                    }
                    min  = Math.min(temp,arr[2*i+1]);
                    sum += min;

                }
            }
        }

    }
}

package Array;

import java.util.Scanner;

public class GetUglyNumber_Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int num = input.nextInt();
            System.out.println(GetUglyNumber_Sot(num));
        }
    }

    private static int GetUglyNumber_Sot(int index) {
        if(index<=0){
            return -1;
        }
        else if(index == 1){
            return 1;
        }
        else{
            int count = 1;
            int num = 2;
            do{
                int temp = num;
                while(temp%2==0){
                    temp /= 2;
                }
                while(temp%3==0){
                    temp /= 3;
                }
                while(temp%5==0){
                    temp /= 5;
                }
                if(temp == 1){
                    count++;
                }
                num++;
            }while(count!=index);

            return num;
        }
    }
}

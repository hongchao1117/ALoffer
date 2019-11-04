package Mathmatic;

import java.util.Scanner;

//两个大数相乘
public class multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        System.out.println(multiplyHelper(s1,s2));
    }

    private static String multiplyHelper(String s1, String s2) {
        int N = s1.length();
        int M = s2.length();
        //设置存储数组
        int[] num = new int[M+N];
        for (int i = N-1; i >=0 ; i--) {
            for (int j = M-1; j >=0 ; j--) {
                int temp = (s1.charAt(i)-'0')*(s2.charAt(j)-'0');
                int p1 = i+j;//存储上一次计算得出的数的 十位数
                int p2 = i+j+1;//存储上一次计算得出的数的  个位数
                int sum = temp + num[p2];
                num[p1] += sum /10;
                num[p2] = sum%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < num.length; i++) {
            sb.append(num[i]);
        }
        return sb.length()==0?"0":sb.toString();
    }
}

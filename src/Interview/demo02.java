package Interview;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int mod = (int) (Math.pow(10,7)+7);
        int count = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 9; j++) {
                if (s.charAt(i)>'0' && s.charAt(i)<'9'){
                    temp = s.charAt(i)-'0';
                    int m = s.length()-1;
                    temp *= (int) Math.pow(10,m);
                }
                if (s.charAt(i)=='?') {
                    String str = s.replace('?','j');
                    temp = Integer.parseInt(str);
                }
                if (temp%13==5)
                    count++;
            }
            count = count%mod;
            System.out.println(count);
        }
    }
}

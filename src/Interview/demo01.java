package Interview;

import java.util.Arrays;
import java.util.Scanner;

        public class demo01 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String s = input.next();
                int[] num = new int[s.length()];
                for (int i = 0; i < num.length; i++) {
                    num[i] = 1;
                }
                long N = (long) Math.pow(10,100);
                for (int k = 0; k < N; k++) {
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i)=='R'){
                            num[i]--;
                            int temp = i+1;
                            num[temp]++;
                        }
                        if (s.charAt(i)=='L'){
                            num[i]--;
                            int temp = i-1;
                            num[temp]++;
                        }
                    }
                }

                System.out.println(Arrays.toString(num));


    }

    private static void replace(char c) {

    }
}

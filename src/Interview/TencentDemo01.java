package Interview;

import java.util.ArrayList;
import java.util.Scanner;

public class TencentDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int len = input.nextInt();
            String s = input.next();
            if (len<11){
                System.out.println("NO");
                continue;
            }
            ArrayList<Character> list = new ArrayList<>();
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (list.size()==0 && chars[j] == '8'){
                    list.add(chars[j]);
                }
                if (list.size()>0){
                    list.add(chars[j]);
                }
            }
            if (list.size()>=11){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}

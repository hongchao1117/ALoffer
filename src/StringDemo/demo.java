package StringDemo;

import java.util.Scanner;

public class demo {
    public String LeftRotateString(String str,int n) {
        StringBuffer sb = new StringBuffer();
        char[] ch = str.toCharArray();
        for(int i = n-1;i<ch.length;i++){
            sb.append(ch[i]);
        }
        for(int i = 0;i<n;i++){
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String s = input.next();
            char[] chars = s.toCharArray();

        }
    }

}

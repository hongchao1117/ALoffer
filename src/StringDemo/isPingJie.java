package StringDemo;

import java.util.Scanner;

public class isPingJie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String s = input.nextLine();
//        System.out.println(binSearch(s));
//        int num = input.nextInt();
//        System.out.println(Doit(num));
        String s = "A";
        s = "B";
        System.out.println(testException());

    }
    public static int testException() {
        int i = 0;
        try {
            i++;
            throw new Exception("error");
        } catch (Exception e) {
            return i++;
        } finally {
            i++;
        }
    }

    private static long Doit(int num) {
        if (num==1)
            return 0;
        if (num==2)
            return 1;
        if (num==3)
            return 2;
        long res = 1;
        while (num>4){
            res = res*3;
            num = num-3;
        }
        res = res*num;
        return res;

    }

    private static String binSearch(String s) {
        int len = 2;
        while (s.length()/len>0){
            if (s.length()%len!=0){
                len++;
                continue;
            }else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < len; i++) {
                    sb.append(s.substring(0,s.length()/len));
                }
                if (sb.toString().equals(s)){
                    return s.substring(0,s.length()/len);
                }
                len++;
            }
        }
        return "false";
    }


}

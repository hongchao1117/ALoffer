package Interview;

import java.util.Scanner;

public class Tdemo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int num = input.nextInt();
        int count = 0;
        while (num>0){
            if (s.contains("T")){
                s = s.replaceFirst("T", "F");
            }else{
                s = s.replaceFirst("F", "T");
            }
            num--;
        }
        int countT = 0;
        for (int i = 0; i < s.length(); i++) {
            if (countT %2==0 && s.charAt(i)=='F'){
                count++;
            }else if (countT %2 ==1 && s.charAt(i)=='F'){
                count--;
            }else if (s.charAt(i)=='T'){
                countT++;
            }
        }
        System.out.println(Math.abs(count));
    }
}

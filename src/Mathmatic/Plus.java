package Mathmatic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        int sum = 0;
        String s = a+"";
        List<String> list = new ArrayList<>();
        while (list.size()<n){
            list.add(s);
            s += a;
        }
        for (int i = 0; i < list.size(); i++) {
            sum += Integer.valueOf(list.get(i));
        }
        System.out.println(sum);
    }
}

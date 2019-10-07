package Interview.kuaishouDemo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();//石头个数
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(input.nextInt());//石头的质量
        }
        Collections.sort(list);
        Collections.reverse(list);
        int temp = list.get(0);
        for (int i = 1; i < k; i++) {
            if (temp!=list.get(i)){
                temp = Math.abs(temp-list.get(i));
            }else if (temp==list.get(i)){
                temp = 0;
            }
        }
        System.out.println(temp);
    }
}

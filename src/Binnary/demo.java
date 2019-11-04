package Binnary;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==7)
                list.remove(i) ;
        }
        System.out.println(list);
//        System.out.println(NumberOf1(4));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}

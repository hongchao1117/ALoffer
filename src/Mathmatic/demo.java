package Mathmatic;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
//        System.out.println(Power(2.5,2));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        System.out.println(list.remove(0));

    }

    public static double Power(double base, int exponent) {
        double num = Math.pow(base,exponent);
        return num;
    }
}

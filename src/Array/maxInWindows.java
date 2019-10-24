package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class maxInWindows {
    public static void main(String[] args) {
        int [] num = {2,3,4,2,6,2,5,1};
        int size = 3;
        System.out.println(maxInWindows(num,size));
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        int len = size;
        for(int i=0;i<num.length-size+1;i++){
            for (int j = i; j <len ; j++) {
                array.add(num[j]);
            }
            len++;
            int temp = Collections.max(array);
            list.add(temp);
            array = new ArrayList<Integer>();
        }

        return list;
    }
}

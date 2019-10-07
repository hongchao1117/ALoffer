package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        reOrderArray(array);
    }



    public static void reOrderArray(int [] array) {
        for (int i = 0; i < array.length-i; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]%2==0 && array[j+1]%2==1){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

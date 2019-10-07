package Array;

import java.util.Arrays;
import java.util.Collections;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum_Solution {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,4,0,3,5,7,3};
        System.out.println(MoreThanHalfNum_SolutionTest(arr));
    }


    public static int MoreThanHalfNum_SolutionTest(int [] array) {
        if (array.length==0) return 0;
        Arrays.sort(array);
        //重现排列后，如果存在，则一定是数组中间的那个数
        int num = array[array.length/2];
        int newLen = array.length/2;
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            if (num==array[i]){
                count++;
                if (count>newLen){
                    return num;
                }
            }
        }
        return 0;
    }
}

package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastNumbers_Solution {
    public static void main(String[] args) {
        int[] input = new int[]{4,5,1,6,2,7,3,8};
        int k = 4;
        System.out.println(GetLeastNumbers_SolutionTest(input,k));
    }


    public static ArrayList<Integer> GetLeastNumbers_SolutionTest(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k>input.length || k<=0) return list;

        Arrays.sort(input);
        for(int i = 0; i < k;i++){
            list.add(input[i]);
        }
        return list;
    }
}

package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class multiply {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(multiply(arr)));
        Set set = new HashSet();
        set.toArray();
    }

    public static int[] multiply(int[] A) {
        int[] B = new int[A.length-1];
        for(int i=0;i<B.length;i++){
            B[i] = 1;
            for(int j=0;j<A.length;j++){
                if(i!=j)
                    B[i] *= A[j];
                else
                    continue;
            }
        }
        return B;
    }
}

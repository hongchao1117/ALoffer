package Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public int Fibonacci(int n) {
        /**List<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(i<2) {
                list.add(1);
                continue;
            }
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list.get(n);*/
        if(n==0)
            return 0;
        else if (n==1){
            return 1;
        }else{
            int[] res = new int[n+1];
            res[0] = 0;
            res[1] = 1;
            for (int i = 2; i <=n; i++) {
                res[i] = res[i-1]+res[i-2];
            }
            return res[n];
        }
    }



}

package Mathmatic;

import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        //根据 等差数列的公式 可得 n 的最大值
        for (int n = (int) Math.sqrt(2*sum); n>=2 ; ++n) {
            //n>=2 ,n或为 奇数 ,或为 偶数
            /**
             * n为奇数时，序列中间的数正好是序列的平均值，
             * 所以条件为：(n & 1) == 1 && sum % n == 0；
             *
             * n为偶数时，序列中间两个数的平均值是序列的平均值，而这个平均值的小数部分为0.5，
             * 所以条件为：(sum % n) * 2 == n.
             */
            if((n%2==1 && sum%n==0) || (n%2==0 && (sum % n)*2==n)){
                ArrayList<Integer> list = new ArrayList<>();
                for (int j=0,k=(sum/n)-(n-1)/2;j<n;j++,k++){
                    list.add(k);
                }
                res.add(list);
            }
        }
        return res;
    }
}

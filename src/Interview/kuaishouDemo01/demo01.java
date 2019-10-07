package Interview.kuaishouDemo01;

import java.util.HashMap;
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//人数
        int m = input.nextInt();//问题数
        HashMap<Character,Integer> map = new HashMap<>();
        String[] strings = new String[n];
        int[] a = new int[m];
        for (int i = 0; i < n; i++) {
            strings[i] = input.next();
        }
        for (int i = 0; i < m; i++) {
            a[i] = input.nextInt();//每道题的分值
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map.containsKey(strings[j].charAt(j)))
                    map.put(strings[j].charAt(j),map.getOrDefault(strings[j].charAt(j),1)+1);
                else{
                    map.put(strings[j].charAt(j),1);
                }
                if (j==n-1){
                    int max = 0;
                    for (int k = 0; k < map.size(); k++) {
                       if (max<map.get(strings[k].charAt(0))){
                           max = map.get(strings[k].charAt(0));
                       }
                    }
                    sum += a[i] * max;
                }
            }
        }
        System.out.println(sum);
    }
}

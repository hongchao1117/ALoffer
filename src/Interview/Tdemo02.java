package Interview;

import java.util.ArrayList;
import java.util.Scanner;

public class Tdemo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int[] r = new int[n];
        int[] g = new int[n];
        int[] b = new int[n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            r[i] = input.nextInt();
            g[i] = input.nextInt();
            b[i] = input.nextInt();
            int min = minNum(r[i],g[i],b[i]);
            list.add(min);
        }
        int sum = 0;
        for(int i:list){
            sum += i;
        }
        System.out.println(sum);

    }

    private static int minNum(int r, int g, int b) {
        int min = Math.min(r,g);
        min = Math.min(min,b);
        return min;
    }
}

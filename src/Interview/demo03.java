package Interview;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            int[][] arr = new int[n-1][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = input.nextInt();
                }
            }


        }
    }
}

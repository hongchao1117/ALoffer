package Interview.PDD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Integer> list = new ArrayList<>();
        //组数
        int num = input.nextInt();
        int[][] nums = new int[num][3];
        for (int i = 0; i < num; i++) {
                for (int j = 0; j < 3; j++) {
                    nums[i][j] = input.nextInt();
                }
                if (nums[i][0] == 0 || nums[i][1] == 0) {
                    list.add(0);
                } else if (nums[i][0] + nums[i][1] + nums[i][2] < 3) {
                    list.add(0);
                } else {
                    int min = Math.min(nums[i][0], nums[i][1]);
                    int max = Math.max(nums[i][0], nums[i][1]);
                    while (min > (max + nums[i][2])/2) {
                        min--;
                    }
                    list.add(min);
                }

            }
            for (int x : list) {
                System.out.println(x);
            }
        }

}

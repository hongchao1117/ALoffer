package Interview;

import java.util.*;

public class Tdemo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        Set<Integer> list1 = new TreeSet<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
            if (list1.contains(nums[i])){
                list2.add(nums[i]);
            }
            else
                list1.add(nums[i]);
        }
        Collections.sort(list2);
        Collections.reverse(list2);
        for(int i: list1){
            list.add(i);
        }
        for(int i:list2){
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}

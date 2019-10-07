package Interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VivoDemo02 {
    /**
     * Welcome to vivo !
     */
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputStr = br.readLine();
            int input[] = parseInts(inputStr.split(" "));
            String output = solution(input);
            System.out.println(output);
        }

        private static int[] parseInts(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return new int[0];
            }
            int[] intArr = new int[strArr.length];
            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
            return intArr;
        }

    private static String solution(int[] input) {
            int len = input[0];//数组个数
            int num = input[1];//倍数
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= len; i++) {
            list1.add(i);
        }
        ArrayList<Integer> temp = list1;
        while (temp.size()>0){
            int index = 0;
            for (int i = 0; i < temp.size(); i++) {
                if ((i+1)%num==0){
                    list.add(list1.get(i));
                    list1.remove(list1.get(i));
                }
            }
            temp = list1;
        }
        return list.toString();
    }

}


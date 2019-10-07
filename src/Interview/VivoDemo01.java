package Interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VivoDemo01 {
    /**
     * Welcome to vivo !
     */
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputStr = br.readLine();
            int input[] = parseInts(inputStr.split(" "));
            int output = solution(input);
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

        private static int solution(int[] input) {
            int count = 0;
            int temp = 0;
            int index = 0;
            while (index<input.length){
                count++;
                temp = input[index];
                if (input[index]==0){
                    index += temp -1;
                }else{
                    index +=temp;
                }
            }
            return count;

        }
    }


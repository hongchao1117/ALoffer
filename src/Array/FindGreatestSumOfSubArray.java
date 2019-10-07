package Array;

public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {
        int[] arr= {6,-3,-2,7,-15,1,2,2};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int count = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (max<array[i]){
                    max = array[i];
                }
                if(j<array.length){
                    count += array[j];
                    if (count>max){
                        max = count;
                    }
                }

            }
        }
        return max;

    }
}

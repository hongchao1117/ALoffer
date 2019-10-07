package Array;

public class isContinuous {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,5};
        System.out.println(isContinuous(numbers));
    }

    public static boolean isContinuous(int [] numbers) {
        int[] d = new int[14];
        d[0] = -5;
        int len = numbers.length;
        int max = -1;
        int min = 14;
        for (int i = 0; i < len; i++) {
            d[numbers[i]]++;
            if (numbers[i]==0){
                continue;
            }
            if (d[numbers[i]]>1){
                return false;
            }
            if (numbers[i]>max){
                max = numbers[i];
            }
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        if (max - min<5){
            return true;
        }
        return false;
    }
}

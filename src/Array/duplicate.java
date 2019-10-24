package Array;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
 * 那么对应的输出是第一个重复的数字2。
 */
public class duplicate {
    public static void main(String[] args) {
        int numbers[] = {2,1,3,0,4};
        int length = numbers.length;
        int [] duplication = new int[1];
        System.out.println(duplicate(numbers,length,duplication));
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        int left = 0;
        A:for ( left = 0; left <length ; left++) {
            int right = length-1;
            while (left<right){
                if (numbers[left]==numbers[right]){
                    duplication[0] = numbers[left];
                    return true;
                }else {
                    right--;
                }
            }
        }
        return false;

    }
}

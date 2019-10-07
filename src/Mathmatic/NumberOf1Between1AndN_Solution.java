package Mathmatic;

public class NumberOf1Between1AndN_Solution {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(5));
    }

    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            while (temp>0){
                if (temp%10==1)
                    count++;
                temp /= 10;
            }
        }
        return count;
    }
}

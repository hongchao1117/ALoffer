package Array;

public class NumberOf1Between1AndN_Solution {
    public static void main(String[] args) {

        System.out.println(NumberOf1Between1AndN_SolutionTest(12041));
    }

    public static int NumberOf1Between1AndN_SolutionTest(int n) {
        int count = 0;

        while (n>0){
            if (n%10==1)
                count++;
            n = n/10;
        }
        return count;
    }
}

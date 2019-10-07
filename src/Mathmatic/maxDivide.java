package Mathmatic;

public class maxDivide {
    public static void main(String[] args) {
        System.out.println(maxDivide(13));
    }
    public static int maxDivide(int num){
        if (num<=0)
            return 0;
        if (num==1 || num==2)
            return 1;
        if (num==3)
            return 2;
        int res = 1;
        while (num>0){
            if (num%3==0){
                num -= 3;
                res *= 3;
            }else if (num%2==0){
                num -= 2;
                res *= 2;
            }else {
                if (num>2){
                    num -= 3;
                    res *= 3;
                }else if (num==1){
                    num --;
                }
            }
        }
        return res;
    }
}

package Mathmatic;

public class myPow {
    public static void main(String[] args) {
        System.out.println(myPow(2.3,3));
    }

    public static double myPow(double x, int n) {
        if(n==0) return 1;
        if(n==1) return x;
        if(n==-1) return 1/x;
        double half = myPow(x,n/2);
        double mod = myPow(x,n%2);
        return half*half*mod;
    }
}

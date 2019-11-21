package Array;

public class Hanoi {
    public void move(int n,char start,char temp,char target){
        if (n==0) return;
        if (n==1) System.out.println(start+"--->"+target);
        else{
            move(n-1,start,target,temp);
            move(n-1,temp,start,target);
        }

    }
}

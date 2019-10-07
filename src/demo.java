import java.util.Scanner;

public class demo {
   private final Object left = new Object();
   private final Object right = new Object();

   public void leftRight(){
       //得到left锁
       synchronized (left){
           //得到right锁
           synchronized (right){
               //dosomething();
           }
       }
   }

    public void rightLeft(){
        //得到left锁
        synchronized (right){
            //得到right锁
            synchronized (left){
                //dosomething();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[1024];
        int i=0;
        int hour = input.nextInt();
        while (input.hasNext()){
            arr[i] = input.nextInt();
            i++;
        }
        int K = 1;
        while (i>0){

        }
    }
}

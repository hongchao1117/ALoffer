package Interview.kuaishouDemo01;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int N = input.nextInt();//行
            int M = input.nextInt();//列
            int max = Math.max(N,M);//作为先行
            int min = Math.min(N,M);//后行
            int sum = 0;
            if (min<=0){
                sum = 0;
            } else if (min==1){
                sum = (max-1)*2;
            }else if (min==2){
                sum = max*min;
            }else {
                if (max%2==1) {
                    sum = min * max + min - 1;
                }else{
                    sum = min*max;
                }
            }
            System.out.println(sum);
        }
        }
}

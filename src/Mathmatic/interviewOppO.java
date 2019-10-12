package Mathmatic;

import java.util.Scanner;

public class interviewOppO {
    public static void main(String[] args) {
       Thread t = new Thread(){
           @Override
           public void run() {
               super.run();
               System.out.println("hong");
           }
       };
       t.run();
       method();
    }

    private static void method() {

        System.out.println("chao");
    }
}

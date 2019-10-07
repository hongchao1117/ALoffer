package StringDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 输入一个字符串,
 * 按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,
 * 则打印出由字符a,b,c
 * 所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Permutation02 {

    public static void main(String[] args) {
        System.out.println(Permutation("abc"));
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str!=null && str.length()>0){
            Permutation02Helper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }

    private static void Permutation02Helper(char[] cs, int i, ArrayList<String> list) {
        if (i == cs.length - 1) {
            String val = String.valueOf(cs);
            if (!list.contains(val))
                list.add(val);
        } else {
            for (int j = i; j < cs.length; j++) {
                swap(cs, i, j);
                Permutation02Helper(cs, i+1, list);
                swap(cs, i, j);
            }
        }
    }

    private static void swap(char[] chars, int j, int i) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}

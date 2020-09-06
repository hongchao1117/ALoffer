package StringDemo;

import java.util.ArrayList;
import java.util.List;

public class replaceSpace {
    public String replaceSpace(StringBuilder str){
        int index = str.indexOf(" ");


        while (index!=-1){
            str.replace(index,index+1,"%20");
            index = str.indexOf(" ",index);//从当前index之后的第一个index
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "hongchao";
        String replace = s.replace("h", "萌芽");

        List<Integer> list = new ArrayList<>();
        list.toArray();
        System.out.println(replace);
    }

}

package StringDemo;

public class replaceSpace {
    public String replaceSpace(StringBuilder str){
        int index = str.indexOf(" ");

        while (index!=-1){
            str.replace(index,index+1,"%20");
            index = str.indexOf(" ",index);//从当前index之后的第一个index
        }
        return str.toString();
    }

}

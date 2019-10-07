package StringDemo;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(ReverseSentence("student. a am I"));
    }


    public static String ReverseSentence(String str) {
        if(str.trim().equals("")){
            return str;
        }
        String[] strings = str.trim().split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = strings.length-1;i>=0;i--){
            sb.append(strings[i]+" ");
        }
        return sb.toString();
    }
}

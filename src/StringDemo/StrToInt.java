package StringDemo;

public class StrToInt {
    public static void main(String[] args) {
        System.out.println(StrToIntTest("123"));
    }


    public static int StrToIntTest(String str) {
        if(str.trim().equals("")||Integer.valueOf(str)==0){
            return 0;
        }
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        if(chars[0]<=0 || (chars[0]!='+' && chars[0]!='-')){
            return 0;
        }else{
            if(chars[0]=='-' || chars[0]>=1)
                sb.append(chars[0]);
        }
        for(int i=1;i<chars.length;i++){
            if(chars[i]>=0 && chars[i]<=9){
                sb.append(chars[i]);
            }else{
                return 0;
            }
        }
        int num = Integer.valueOf(sb.toString());
        return num;
    }
}

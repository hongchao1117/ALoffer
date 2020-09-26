package StringDemo;

public class firstUniqChar {
    public char firstUniqChar(String s) {
        if (s.trim().equals(""))
            return ' ';
        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);
            if (s.indexOf(chars)==i && s.indexOf(chars,i+1)==-1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}

package StringDemo;

public class matchDP2 {
    public static boolean matchDP2(char[] str, char[] pattern){
        if (str==null || pattern == null){
            return false;
        }
        boolean[][] dp = new boolean[str.length+1][pattern.length+1];
        dp[str.length][pattern.length] = true;
        for (int i = str.length; i >= 0; i--) {//外循环：从空串开始匹配
            for (int j = pattern.length - 1; j >= 0; j--) {//内循环：从最后一个字符开始匹配
                //1.当前相等 立一个flag：相当于把if判断抽取出来，简化代码first_isMatch
                boolean first_isMatch = (i != str.length) &&
                        (str[i] == pattern[j] || pattern[j] == '.');
                //2.下一个是“*”
                if(j < pattern.length - 1 && pattern[j + 1] == '*') {
                    dp[i][j] = dp[i][j + 2] || ( first_isMatch && dp[i + 1][j]);
                }else {
                    dp[i][j] = first_isMatch && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }
}

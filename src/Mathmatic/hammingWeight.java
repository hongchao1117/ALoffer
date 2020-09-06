package Mathmatic;

public class hammingWeight {

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
        StringBuilder sb = new StringBuilder();
        int count = 9;
        for (int i = 0; i < count; i++) {
            sb.append(9);
        }
        int num = Integer.valueOf(sb.toString());
    }
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

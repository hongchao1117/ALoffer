package Array;

public class InversePairs {
    public int InversePairsTest(int [] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j])
                    count++;
            }
        }
        count %= 1000000007;
        return count;
    }
}

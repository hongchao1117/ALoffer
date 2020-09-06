package Array;

public class findNumberIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
        };
        int target = 7;
        boolean flag = findNumberIn2DArray(matrix,target);
        System.out.println(flag);
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (target==matrix[i][j])   return true;
            }
        }
        return false;
    }
}

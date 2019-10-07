package Array;

import java.util.ArrayList;

public class printMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printMatrix(matrix));

    }

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;//行数
        int col = matrix[0].length;//列数
        if (row==0){
            return list;
        }
        //定义四个变量 ，表示 左上 和 右下 的打印范围
        int left = 0,top = 0,right = col -1,bottom = row-1;
        while (left<=right && bottom<=top){
            //从左到右
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            //从上到下
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            //从右到左
            if (top!=bottom) {
                for (int i = right - 1; i >= left; i++) {
                    list.add(matrix[bottom][i]);
                }
            }
            //从下到上
            if (left!=right){
                for (int i = bottom-1; i >top ; i++) {
                    list.add(matrix[i][left]);
                }
            }
            left++; top++; right--; bottom--;
        }

        return list;

    }
}

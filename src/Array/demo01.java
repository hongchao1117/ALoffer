package Array;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        String s = "123456789987654321";
        System.out.println(printMatrix(matrix));
    }


    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        //作为存放结果的容器
        ArrayList<Integer> list = new ArrayList<>();
        //拿到出事数组的行数
        int row = matrix.length;

        while(row != 0){
            //将数组的第一行先添加进容器中
            for(int i=0;i<matrix[0].length;i++)
                list.add(matrix[0][i]);
            //当行数等于1时就没有必要再继续执行了，在上面打印完之后就可以停止了
            if(row == 1)
                break;
            //删除上面遍历的数组的第一行，然后旋转这个数组并返回
            matrix = revert(matrix);
            //更新行数
            row = matrix.length;
        }

        //返回
        return list;
    }

    private static int[][] revert(int[][] matrix){
        //拿到matrix的行数和列数
        int rows = matrix.length;
        int cols = matrix[0].length;

        //因为我们要将原数组遍历过的第一行删除，然后旋转变成一个新的数组，所以先初始化一下这个新数组
        int[][] newMatrix = new int[cols][rows-1];

        //对这个新数组进行赋值
        for(int j=cols-1;j>=0;j--){
            for(int i=1;i<rows;i++){
                newMatrix[cols-j-1][i-1] = matrix[i][j];
            }
        }

        //返回新数组
        return newMatrix;
    }

}

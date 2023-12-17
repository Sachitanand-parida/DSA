package BinarySearch;

import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
    int[][] matrix={                //every row and column is sorted in ascending array form
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
    };
        System.out.println(Arrays.toString(binSearch2D(matrix,37)));

    }
    private static int[] binSearch2D(int[][] matrix, int target){
        int row=0;
        int col=matrix.length-1;

        while (row<matrix.length && col>=0){
            if(matrix[row][col]==target)
                return new int[]{row,col};

            if(matrix[row][col]>target)           //eliminating the column > target as every element in that col will > target
                col--;
            else
                row++;
        }
        return new int[]{-1,-1};
    }
}

package BinarySearch;

import java.util.Arrays;

public class BinarySearch2DSortedArray {
    public static void main(String[] args) {
    int[][] matrix={                //every row and column is sorted in ascending array form
            {1,2,13,14},
            {25,26,37,38},
            {49,50,61,62},
            {73,84,85,96}
    };
        System.out.println(Arrays.toString(binSearch2D(matrix,49)));

    }
    private static int[] binSearch2D(int[][] matrix, int target){
        int row=0;
        int col=matrix.length-1;

        while (row<matrix.length && col>=0){
            if(matrix[row][col]==target)
                return new int[]{row,col};

            if(matrix[row][col]<target)           //eliminating the row < target as every element in that row will be < target
                row++;
            else
                col--;
        }
        return new int[]{-1,-1};
    }
}

package Sorting;

import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        //For every index, put that index element at the correct position of the LHS.
        //Usecase: If array is sorted, steps gets reduced.
        // Used for smaller values of n, works good when array is partially sorted.
        //It takes part in hybrid sorting algos. Internal sort methods in Java use Insertion sorting with Merge or Quick sort.


         int[] arr= {9,7,6,5,3,1};

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1])
                    swapNum(arr,j,j-1);
                else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    private static void swapNum(int[] arr,int first, int last) {
        int temp= arr[first];
        arr[first]= arr[last];
        arr[last]= temp;
    }
}

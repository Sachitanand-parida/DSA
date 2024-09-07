package Sorting;

import java.util.Arrays;

//*** Use case hint: When given range from 1 to N- Use cyclic sort
// find the missing no from 1 to N, find the duplicate no from 1 to N etc.
// The value is closely associated with its index, like 5 is associated with index 4, 3 is associated with index 2 etc.
// If the value is not equal to its correct index, then swap the index values.

public class CycleSortingAlgo {

    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 4, 5, 7, 6, 9, 3};

        //0-1
        //1-2
        //2-3
        //3-4
        int i=0, correct=0;

        while (i< arr.length){
            correct= arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp= arr[i];
        arr[i]= arr[correct];
        arr[correct]= temp;
    }
}

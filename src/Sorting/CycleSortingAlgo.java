package Sorting;

import java.util.Arrays;

//*** Use case hint: When given range from 1 to N- Use cyclic sort
// find the missing no from 1 to N, find the duplicate no from 1 to N etc.
// The value is closely associated with its index, like 5 is associated with index 4, 3 is associated with index 2 etc.
// If the value is not equal to its correct index, then swap the index values.

public class CycleSortingAlgo {

    public static void main(String[] args) {


        //0-1
        //1-2
        //2-3
        //3-4
        /*
        Basic sorting Algorithm
        int[] arr = {1, 8, 2, 4, 5, 7, 6, 9, 3};

        int i=0, correct=0;

        while (i< arr.length){
            correct= arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));*/

        /*
        //Missing number

        //if the array is [0,N] then correct= arr[i]. If the array is [1,N] then correct= arr[i]-1;

        int[] arr= {4,3,2,7,8,2,3,1};
        int i=0, correct=0;
        while(i<arr.length){
            correct= arr[i]-1;
            if(  arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j <arr.length; j++) {
            if(arr[j]!=j+1)
                System.out.println("Missing number is: "+(j+1));

        }*/

        /*
        //Missing number from [0,4,2,1]
        int[] arr={0,4,2,1};

        int i=0, correct=0;
        while(i< arr.length){
            correct=arr[i];                              //because correct index matches the values.
            if(arr[i]<arr.length && arr[i]!=arr[correct])    //extra condition because array of size 4 has an element 4 which will throw AIOOB exception
                swap(arr, i, correct);
            i++;
        }
        System.out.println("sorted array is: "+Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j)
                System.out.println("Missing value is: "+j);
        }

         */


        //find the one repeated number

        int[] arr= {1,3,4,2,2}; //1,2,2,3,4
        int i=0, correct=0;

        while (i<arr.length){
            correct=arr[i]-1;

            if(arr[i] != arr[correct] ){
                swap(arr, i, correct);
            }
            else i++;
        }
        System.out.println("sorted array is:"+ Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1)
                System.out.println("Missing value is: "+ (j+1));
        }

    }

    private static void swap(int[] arr, int i, int correct) {
        int temp= arr[i];
        arr[i]= arr[correct];
        arr[correct]= temp;
    }
}

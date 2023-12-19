package Sorting;

import java.util.Arrays;

public class SelectionSort  {
    public static void main(String[] args) {

        int[] arr={-1,-99,23,343,23,232,-9999};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void selection(int[] arr){

        for(int i=0;i<arr.length;i++){
            //we need to select an element and put it at the right index

            int last=arr.length-i-1;        //last index

            int max=getMaxIndexOf(arr,0,last);      //gets the max index starting from 0 to the current last
            swapVal(arr,max,last);                       //swaps the two values
        }
    }

    private static void swapVal(int[] arr, int first, int last) {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    private static int getMaxIndexOf(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){                   //we want to find the max between the start and end indexes only
            if(arr[i]>arr[max])
                max=i;
        }
        return max;
    }
}

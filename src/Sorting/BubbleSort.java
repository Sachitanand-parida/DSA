package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={23,2,54,672,12,76,3437,23};
        bubble(arr);

        System.out.println(Arrays.toString(arr));

    }
    private static void bubble(int[] arr){

        boolean swapped;

        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){        //j runs for N-i-1 times so we can also write j<=arr.length-i-1
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)                            //it runs only for i=0, if no swapping is done that means the
                break;                              //array is already sorted, so it won't run for i=1,2,... saves execution time
        }
    }
}

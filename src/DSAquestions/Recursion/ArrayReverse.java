package DSAquestions.Recursion;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        int[] copy= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[arr.length - 1 - i];
        }
        //System.out.println(Arrays.toString(copy));

        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    public static void reverse(int[] arr, int start, int end) {

        if(start>= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start+1, end - 1);
    }
}

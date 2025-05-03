package DSAquestions.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr= {4,2,5,44,25,1};
        int length=arr.length;
        boolean swapped;

        for (int i = 0; i < length-1; i++) {
            swapped = false;

            for (int j = 0; j < length-1-i; j++) {
                if(arr[j]>arr[j+1]) {

                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

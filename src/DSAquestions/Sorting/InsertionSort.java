package DSAquestions.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,45,1,34,5,81};

        for (int i = 1; i < arr.length; i++) {
            int temp= arr[i];
            int j = i-1;

            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package DSAquestions.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr= {3,5,1,78,33};
        int n= arr.length;

        for(int i=0; i< n-1; i++) {
            int maxIndex= i;
            for (int j=i+1 ; j<n ; j++){
                if(arr[j]> arr[maxIndex])
                    maxIndex= j;
            }
            int temp= arr[maxIndex];
            arr[maxIndex]= arr[i];
            arr[i]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Recursion.RecursionSorting;

import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        //Logic: Divide the array into half, sort each halves separately, and then merge
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr){

        if(arr.length ==1)              //base condition: at the end of the iteration, we only have single element array
            return  arr;

        int mid= arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));      //sort the left half
        int[] right= mergeSort(Arrays.copyOfRange(arr,mid, arr.length)); // sort the right half

        return merge(left, right);                                       // merge the two halves
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix= new int[left.length+ right.length];

        int i=0, j=0, k=0;

        while (i< left.length && j< right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k]= right[j];
                j++;
            }
            k++;
        }
        //it may be possible that there are remaining elements in the array, copy those remaining elements

        while (i< left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}

package RecursionLevel3;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {

        int[] arr={34,2,65,753,22};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr, int start, int end){
        /*
        It follows the exact same pattern as the pattern problem in class Pattern1
        Keep that in mind while writing checks for recursive bubble sort
         */

        if(start == 0)
            return;

        if(end < start){
            if(arr[end] > arr[end+1]){
                //swap
                int temp= arr[end];
                arr[end]= arr[end+1];
                arr[end+1] = temp;
            }
            bubble(arr,start,end+1);
        }
        else
            bubble(arr,start-1, 0);
    }
}

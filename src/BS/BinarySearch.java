package BS;

import java.util.Arrays;


public class BinarySearch {
    public static void main(String[] args) {
        
        Integer[] arr={1,4,6,9,45,653,890};
        Arrays.sort(arr);

        Integer index=binarySearchMethod(arr,9);
        System.out.println("index: "+index);
    }

    /**
     *
     * @param arr
     * @param target
     * @return
     */
    private static Integer binarySearchMethod(Integer[] arr, int target) {
        int start= 0;
        int end=arr.length-1;

        int middle=0;
        while (start<= end){
             middle= start+(end-start)/2;

            if(target>arr[middle])
                start=middle+1;
            else if(target<arr[middle])
                end=middle-1;
            else return middle;
        }
        return -1;

    }
}

package Recursion.RecursionEasy;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr= {1,34,45,56,67,78,89,90,233,344};
        System.out.println(binSearch(arr,89,0, arr.length-1));

    }
    public static int binSearch(int[] arr, int target, int start, int end){

        if(start>end)
            return -1;

        int middle= start + (end-start)/2;

        if(target == arr[middle])
            return middle;

        if(target< arr[middle])
            return binSearch(arr, target,start, middle-1);

        return binSearch(arr, target, middle+1, end);
    }
}

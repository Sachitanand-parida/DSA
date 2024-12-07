package Recursion.RecusionLevel2;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr= {1,3,5,34,6};
        System.out.println("At index: "+ linearSearchMethod(arr, 0, 8));
        System.out.println("At index: "+ linearSearchFromLastMethod(arr, arr.length-1, 1));
    }

    private static int linearSearchMethod(int[] arr, int index, int value) {
        if(arr[index]==value)
            return index;

        if(index== arr.length-1)            //if no element found means index will be at the last index
            return -1;

        return linearSearchMethod(arr,index+1,value);
    }

    private static int linearSearchFromLastMethod(int[] arr, int index, int value) {
        if(arr[index]==value)
            return index;

        if(index==0)            //if no element found means index will be at the last index
            return -1;

        return linearSearchFromLastMethod(arr,index-1,value);
    }
}

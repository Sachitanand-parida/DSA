package BinarySearch;

public class BinarySearchDemo {
    public static void main(String[] args) {

        int[] arr={1,2,34,54,67,89,111,232};
        int index=binSearch(arr,11);
        System.out.println("Target found at index: "+index);
    }

    private static int binSearch(int[] arr, int target) {

        int start=0,mid=0;
        int end=arr.length-1;

        while(start<=end){

            mid=start+(end-start)/2;        //(start+end)/2 case, it might be possible that adding both> integer limit
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
             else return mid;
        }
        return -1;

    }
}

package BinarySearchQuestions;

public class BinarySearchDemo {
    public static void main(String[] args) {

        int[] arr={234,23,11,9,8,7,6,5,4,3,2,1};
        int index=0;
        if(arr[0]<arr[arr.length-1]) {
             index = binSearch(arr, 11);
        }
        else
        {
            index=binSearchRev(arr,11);
        }
        System.out.println("Target found at index: "+index);
    }

    private static int binSearchRev(int[] arr, int target) {
        int start=0,mid=0;
        int end=arr.length-1;

        while(start<=end){

            mid=start+(end-start)/2;        //(start+end)/2 case, it might be possible that adding both> integer limit
            if(arr[mid]>target){
                start=mid+1;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else return mid;
        }
        return -1;

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

package BinarySearchQuestions;

public class PeakMountain {
    public static void main(String[] args) {

        int[] arr={0,10,5,2};
        System.out.println(binSearch(arr));

    }
    private static int binSearch(int[] arr){

        int start=0, mid=0, end=arr.length-1;

        while(start<end){               //do not put <= because at the end start will be = end
            mid=start+ (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;       //or return end. Both the values are pointing to the same max value.
    }
}

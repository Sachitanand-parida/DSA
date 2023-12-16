package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,4,4,4,4,9};
        int start=binSearch(arr,4,true);
        int last=binSearch(arr,4,false);
        int[] result={start,last};
        System.out.println(Arrays.toString(result));


    }
    private static int binSearch(int[] arr, int target, boolean findFirstIndex) {

        int start=0,mid=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){

            mid=start+(end-start)/2;        //(start+end)/2 case, it might be possible that adding both> integer limit
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                ans=mid;
                if(findFirstIndex){
                    end=mid-1;
                }
                else start=mid+1;
            }
        }
        return ans;

    }
}

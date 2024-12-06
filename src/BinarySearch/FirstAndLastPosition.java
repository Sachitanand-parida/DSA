/*
package binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        Integer[] arr={5,5,7,7,8,8,8,10};
        Integer target=8;

        System.out.println("Occurence is at "+ Arrays.toString(searchRange(arr, target)));

    }
    public static Integer[] searchRange(Integer[] nums, Integer target){
        Integer[] ans={-1,-1};

        Integer start= search(nums, target, true);
        Integer end= search(nums, target, false);

        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    public static Integer search(Integer[] nums, Integer target, Boolean findStartIndex){
        int[] ans={-1,-1};

        int start= 0;
        int end=nums.length-1;

        int middle=0;
        while (start<= end){
            middle= start+(end-start)/2;

            if(target>nums[middle])
                start=middle+1;
            else if(target<nums[middle])
                end=middle-1;
            else {
                ans=middle;
                if(findStartIndex){
                    end= middle-1;
                }else{
                    start= middle+1;
                }
            }
        }
        return ans;
    }

}
*/

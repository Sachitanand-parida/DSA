package BinarySearchQuestions;

public class PosOfNumInfiniteArray {
    public static void main(String[] args) {

        int[] arr={1,2,2,2,3,6,6,8,8,8,8,8,43,47,777,788,2322,34343};
        int position= answer(arr,43);
        System.out.println(position);
    }

    private static int answer(int[] arr,int target){  //to find the range in which target might occur
        int start=0, end=1;
        while (target>arr[end]){
            int temp=end+1;
            end=end+ (end-start+1)*2;
            start=temp;
        }
        return binSearchPos(arr,target,start,end);
    }

    private static int binSearchPos(int[] arr, int target, int start, int end) {
        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;

            if(target>arr[mid])
                start=mid+1;
            else if(target<arr[mid])
                end=mid-1;
            else return mid;

        }
        return -1;
    }

}

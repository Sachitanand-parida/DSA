package BinarySearchQuestions;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,6,7,12,24,36,47,68};
        int target=35;
        int result=floorNumber(arr,target);
        if(result !=-1)
            System.out.println(arr[result]);
        else
            System.out.println("Floor of the number could not be found");
    }

    private static int floorNumber(int[] arr, int target) {
        int start=0, end=arr.length-1, mid=0;
        if(target<arr[0])
            return -1;
        if(target>arr[arr.length-1])
            return arr.length-1;

        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]) {
                end=mid-1;
            }
            else if(target>arr[mid]) {
                start= mid+1;
            }
            
            else return mid;
        }
        return end;
    }
}

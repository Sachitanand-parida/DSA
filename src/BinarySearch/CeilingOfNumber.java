package BinarySearch;

public class CeilingOfNumber{
    public static void main(String[] args) {
        int[] arr={2,3,6,7,12,24,36,47,68};
        int target=69;
        int result=ceilingNumber(arr,target);
        if(result !=-1)
            System.out.println(arr[result]);
        else
            System.out.println("Ceiling of the number could not be found");
    }

    private static int ceilingNumber(int[] arr, int target) {
        int start=0, end=arr.length-1, mid=0;
        if(target>arr[arr.length-1])
            return -1;

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
        return start;
    }
}

package BinarySearchQuestions;

public class RotatedArray {
    public static void main(String[] args) {    //Incomplete solution

        int[] arr={3,4,5,6,8,0,1,2};

        int maxValue=binarySearchForMax(arr);
        System.out.println(args[maxValue]);
    }

    private static int binarySearchForMax(int[] arr) {
        int start=0, mid=0, end=arr.length-1;

        while(start<end){

            mid=start+(end-start)/2;
            if(arr[mid+1]<arr[mid])
                return mid;
            else
                start= mid+1;
        }
        System.out.println(end);
        return -1;
    }
}

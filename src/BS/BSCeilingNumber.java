package BS;

public class BSCeilingNumber {

    //ceiling number= smallest element in the array >= target
    public static void main(String[] args) {

        int[] arr={2,4,5,7,8,12,23};
        int target=6;

        int bs=ceiling(arr,target);
        System.out.println("Number found "+ arr[bs]);
        //System.out.println("hello");

    }

    private static int ceiling(int[] arr, int target) {

        int start= 0;
        int end=arr.length-1;
        int middle=0;

        while (start<= end){
            middle= start+(end-start)/2;

            if(target>arr[middle])
                start=middle+1;
            else if(target<arr[middle])
                end=middle-1;
            else return middle;
        }
        return start;
    }
}

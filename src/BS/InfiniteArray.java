package BS;

public class InfiniteArray {
    public static void main(String[] args) {
        //assume the array is infinite and we don't know the end index of it.
        Integer[] arr={1,2,4,5,6,8,34,65,76,88,94,105,206,256,378,477,555,666,777,888,999,1111,1222};
        Integer ans = answer(arr, 2);
        System.out.println("found at position: "+ ans);

    }

    private static Integer answer(Integer[] arr,Integer target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end;
            end=end+(end-start+1)*2;
            //end=end*2; less optimized
            start=temp;
        }
        return binarySearchMethod(arr,target, start,end);
    }
    private static Integer binarySearchMethod(Integer[] arr, int target, int start, int end) {

        int middle=0;
        while (start<= end){
            middle= start+(end-start)/2;

            if(target>arr[middle])
                start=middle+1;
            else if(target<arr[middle])
                end=middle-1;
            else return middle;
        }
        return -1;

    }
}

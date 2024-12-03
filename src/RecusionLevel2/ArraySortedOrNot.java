package RecusionLevel2;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,4,5};
        System.out.println(sortCheck(arr,0));
    }

    private static boolean sortCheck(int[] arr, int index) {

        if(index == arr.length-1)
            return true;

        return arr[index] <= arr[index+1] && sortCheck(arr, index+1);
    }
}

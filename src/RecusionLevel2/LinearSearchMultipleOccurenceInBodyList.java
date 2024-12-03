package RecusionLevel2;

import java.util.ArrayList;

public class LinearSearchMultipleOccurenceInBodyList {

    public static void main(String[] args) {
        int[] arr= {12,2,3,3,3,4,56,2};
        var list= search(arr, 0,3);
        System.out.println(list);

    }
    static ArrayList<Integer> search(int[] arr, int index, int target){
        ArrayList<Integer> list= new ArrayList<>();   //In efficient because we create this ArrayList with every iteration.
        /*
        We can create list in the body itself, but we need to assign the list as below with all the downstream calls
         */

        if(arr[index]==target){
            list.add(index);
        }
        if(index== arr.length-1)
            return list;

        ArrayList<Integer>ansFromBelowCalls= search(arr, index+1, target); // get the collections of all the values from each upstream call
        list.addAll(ansFromBelowCalls);
        return list;

    }
}

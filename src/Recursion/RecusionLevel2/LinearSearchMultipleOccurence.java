package Recursion.RecusionLevel2;

import java.util.ArrayList;

public class LinearSearchMultipleOccurence {

    public static void main(String[] args) {
        int[] arr= {12,2,3,3,3,4,56,2};
        var list= search(arr, 0,3);
        System.out.println(list);

    }
    static ArrayList<Integer> list= new ArrayList<>();     // if we write list inside the search() then it won't be passed to recursion methods
    static ArrayList<Integer> search(int[] arr, int index, int target){
        /*
        If we want to use list inside this method then we need to take list as an argument of search()
        then only it will be passed to other recursive calls.
         */

        if(arr[index]==target){
            list.add(index);
        }
        if(index== arr.length-1)
            return list;

        return search(arr, index+1, target);

    }
}

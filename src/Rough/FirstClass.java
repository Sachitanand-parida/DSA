package Rough;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstClass {
    public static void main(String[] args) {

        int[][] arr={{1,2,107},{5,2,97}};
        int[] result=maxWealth(arr);
        System.out.println(Arrays.stream(result).max().getAsInt());

    }

    private static int[] maxWealth(int[][] arr) {
        int[] result=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            result[i]=sum;
            sum=0;
        }
        return result;
    }


}


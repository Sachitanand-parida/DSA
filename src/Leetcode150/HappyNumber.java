package Leetcode150;

public class HappyNumber {
    public static void main(String[] args) {
        int n= 19;
        if(returnSum(n)==1)
            System.out.println(true);
        else {
            int value= returnSum(returnSum(19));
        }
    }
    static int returnSum(int n){
        int rem=0, sum=0;

        while (n>0){
            rem= n %10;
            sum += rem * rem;
            n= n/10;
        }
        return sum;
    }
}

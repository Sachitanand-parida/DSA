package RecursionEasy;

/*
Problem statement: For any num, return the no of steps it would take to reduce the number to 0.
if the subsequent number is even, div it by 2
if the subsequent number is odd, subtract 1
 */

public class HelperMethodExp {
    public static void main(String[] args) {
        System.out.println(func1(41));
    }
    public static int func1(int n){
        return helperMethod1(n,0);
    }

    private static int helperMethod1(int n, int counter) {
        if(n==0)
            return counter;
        if(n%2==0)
            return helperMethod1(n/2,counter+1);
        return helperMethod1(n-1, counter+1);
    }
}

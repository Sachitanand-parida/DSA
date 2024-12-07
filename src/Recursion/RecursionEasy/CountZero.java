package Recursion.RecursionEasy;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZeroByRecursion(0));
    }

    private static int countZero(int n) {
        int count=0, rem=0;
        while (n>0){
            rem= n%10;
            if(rem==0)
                count++;
            n/=10;
        }
        return count;
    }
    private static int countZeroByRecursion(int n) {
        if(n==0)
            return 1;

        return helperMethod(n,0);
}

    private static int helperMethod(int n, int count) {
        if(n==0)
            return count;

        int rem= n%10;
        if(rem == 0)
            return helperMethod(n/10, count+1);
        return helperMethod(n/10, count);
    }

    }

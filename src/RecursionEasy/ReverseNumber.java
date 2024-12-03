package RecursionEasy;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(234));
    }
    public static int reverse(int n){
        int digits=(int)(Math.log10(n))+1;

        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 ==n)                // trick to check the last digit. Single digit number % n ==n.
            return n;
        //int rem= n%10;
        return (int) (n%10*Math.pow(10,digits-1) + helper(n/10, digits-1));
    }

}

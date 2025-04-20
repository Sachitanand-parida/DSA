package DSAquestions.BasicMath;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
    public static int reverse(int x) {

        int rev=0, isNegative= x>0 ? 1: -1;

        x= Math.abs(x);
        while(x>0){

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && (x%10) > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && (x%10) < -8)) {
                return 0;
            }
            rev=rev*10 + (x%10); // x%10 is the remainder
            x= x/10;
        }
        rev= rev* isNegative;

        return rev;
    }
}

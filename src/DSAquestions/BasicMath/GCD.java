package DSAquestions.BasicMath;

import java.util.Arrays;

public class GCD {

    public static void main(String[] args) {
        System.out.println("GCD is= "+findGCD1(6,10));
        System.out.println("GCD is= "+gcdRecursion(6,10));
        System.out.println("GCD is= "+gcdIterative(18,48));

        int[] nums= {1,2,3,4,5};
        Arrays.sort(nums);
    }

    private static Integer findGCD1(int num1, int num2) {
        int gcd= 1;

        for (int i = 1; i < Math.min(num1, num2); i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd= i;
            }
        }
        return gcd;
    }

    private static int gcdRecursion(int m, int n) {
        if ( n == 0) {
            return m;
        }
        return gcdRecursion(n, m%n);
    }

    private static int gcdIterative(int m, int n) {

        int temp;
        while(n!= 0){
            temp= n;
            n= m%n;
            m= temp;
        }
        return m;
    }
}

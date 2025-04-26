package DSAquestions.BasicMath;

import java.util.Arrays;

public class PrimeSieve {

    // Returns a boolean array where index i is true if i is prime
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int n = 100;
        boolean[] primeFlags = sieveOfEratosthenes(n);

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (primeFlags[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

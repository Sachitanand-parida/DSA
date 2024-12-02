package MathsForDSA;

public class SeiveOfErastosthenes {
    public static void main(String[] args) {
        seive(40);

    }
    static void seive(int n){

        boolean prime[]= new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            prime[i]= true;                 //make every element of the boolean array as true, meaning all are primes at start
        }

        for (int p = 2; p*p < n ; p++) {    //ex, for n=40, we need not to go beyond 6*6=36. 7*7=49 is outside 40.

            if(prime[p]== true){

                for (int i = p*p; i <=n ; i+=p) {  //** for every prime no, say 3, the next index to be flipped is 3^2.
                    prime[i]= false;               // i+=p gives the next multiple in the next iteration
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (prime[i]==true)
                System.out.print(i+ " ");
        }
    }
}

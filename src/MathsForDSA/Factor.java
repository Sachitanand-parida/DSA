package MathsForDSA;

public class Factor {
    public static void main(String[] args) {
        factor(20);
    }
    public static void factor(int n){

        for (int i = 1; i <= Math.sqrt(n); ++i) {
            if(n%i == 0){
               if(i == n/i)    // ex 100= 10 * 10. Ten should be printed once
                   System.out.print(i+ " ");
               else
                   System.out.print(i+ " "+ n/i+ " ");
            }

        }
    }
    static void getFactors (int n)
    {
        for(int i = 1; i <= Math.sqrt(n); ++i)
        {
            if (n % i == 0){
                // If both pair of factors are equal then we just print
                // once, example for 100 : (a, b) : (10, 10)
                // 10 should be printed just once
                if(i == n / i)
                    System.out.print(i + ", ");

                    // else print both the pairs
                else
                    System.out.print(i + ", " + n/i + ", ");
            }
        }
    }
}

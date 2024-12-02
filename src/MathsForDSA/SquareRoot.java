package MathsForDSA;

public class SquareRoot {
    public static void main(String[] args) {

        System.out.printf("sqrt of 40 with precision upto 4 digit is= %.4f", sqrt(40,4));
    }

    //Basically used Binary Search to find the square root which lies between 1 and n.
    //Time complexity O(log(n))
    static double sqrt(int n, int precision) {
        int start = 0;
        int end = n;
        double root = 0.0, increment = 0.1;

        while (start < end) {
            int m = start + (end - start) / 2;

            if (m * m == n){
                root=m;
                return m;
            }

            if (m * m > n){
                end = m - 1;
                root=end;
            }
            else {
                start = m + 1;
                root=m;
            }
        }

        for (int i = 0; i < 4; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment;       //to fall back to the previous answer if root*root > n
            increment /= 10;
        }
        return root;
    }
}

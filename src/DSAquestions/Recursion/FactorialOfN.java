package DSAquestions.Recursion;

public class FactorialOfN {
    public static void main(String[] args) {

        System.out.println(factorialOfNum(5));
    }

    private static int factorialOfNum(int n) {
        if(n==0)
            return 1;

        return n* factorialOfNum(n-1);
    }
}

package DSAquestions.Recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        //printNames(10);
        //printNumbers(50,1);
        printNumbers1ToN(10);
    }

    private static void printNumbers1ToN(int n) {
        if(n==0)
            return;
        printNumbers1ToN(n-1);
        System.out.println(n);
    }

    private static void printNumbers(int n, int count) {
        if(n==0)
            return;
        System.out.println(count);
        count++;
        printNumbers(n-1, count);
    }

    private static void printNames(int n) {
        if(n == 0)
            return;

        System.out.println("sachit");

        printNames(n-1);
    }
}

package Recursion.RecursionEasy;

public class PrintValues {
    public static void main(String[] args) {
        printVal(5);
    }
    static void printVal(int n){
        if(n==0)
            return;
        printVal(n-1);
        System.out.println(n);
    }
}

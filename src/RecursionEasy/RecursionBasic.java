package RecursionEasy;

public class RecursionBasic {
    public static void main(String[] args) {

        /*
        Recursion helps in solving complex problems in a simpler way
        Recursion problem can be converted to iteration and vice-versa
        Space complexity is not constant because of the recursive nature of the calls
         */
        System.out.println(fibo(6));
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int n){

        if(n<2)
            return (n);

        return fibo(n-1) + fibo(n-2);
    }
}

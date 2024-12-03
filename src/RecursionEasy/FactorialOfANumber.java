package RecursionEasy;

public class FactorialOfANumber {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    static int factorial(int n){

        //5= 1*2*3*4*5= 120  f(n)*f(n-1). Base condition: n==1

        if(n==1)
            return n;

        return n*factorial(n-1);
    }
}

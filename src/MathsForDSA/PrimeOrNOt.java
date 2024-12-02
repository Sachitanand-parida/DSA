package MathsForDSA;

public class PrimeOrNOt {
    public static void main(String[] args) {

        for (int i = 1; i < 50; i++) {
            System.out.println(i+ " "+ primeOrNot(i));
        }
    }
    static boolean primeOrNot(int n){
        int count=0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i ==0)
                count++;
        }
        if (count==1)
            return true;
        else
            return false;

    }
}

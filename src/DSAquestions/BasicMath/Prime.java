package DSAquestions.BasicMath;

public class Prime {
    public static void main(String[] args) {

        int num=10;
        System.out.println(prime(num));
    }

    private static boolean prime(int num) {

        int count=0;
        for (int i = 1; i*i <=num ; i++) {

            if(num % i==0){
                count+=2;
            }
            if(count>2)
                return false;
        }
        if(count==2)
            return true;
        else
            return false;
    }
}

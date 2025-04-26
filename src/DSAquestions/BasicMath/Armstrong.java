package DSAquestions.BasicMath;

public class Armstrong {
    public static void main(String[] args) {

        int num= 12;
        System.out.println(num + " is a Armstrong number: "+armstrong(num));

    }

    private static Boolean armstrong(int num) {
        int digit= (int) (Math.log10(num)+1);
        int original= num, sum=0, rem=0;
        while (num!=0){
            rem= num%10;
            sum= (int) (sum+ Math.pow(rem, digit));
            num= num/10;
        }
        if (sum==original)
            return true;
        else return false;
    }
}

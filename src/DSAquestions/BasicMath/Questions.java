package DSAquestions.BasicMath;

public class Questions {
    public static void main(String[] args) {
        int n=12345, rem=0, count=0;

        while(n>0){
            rem= n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
        System.out.println((int)Math.log10(12345)+1);
        System.out.println(String.valueOf(12345).length());
    }

}

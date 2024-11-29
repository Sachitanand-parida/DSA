package BitwiseAndNumberSystem;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num=9, count=0;

        while (num>0){
            if((num &1) ==1)
                count++;
            num=num>>1;
        }
        if (count==1)
            System.out.println("Power of Two");
        else System.out.println("Not a power of two");

        //second method
        int n=5;
        if((n & (n-1))==0){
            System.out.println("power of two");
        }
        else System.out.println("not a power of two");
    }
}

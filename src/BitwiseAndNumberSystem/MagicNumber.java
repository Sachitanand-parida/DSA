package BitwiseAndNumberSystem;

public class MagicNumber {

    /*
    Magic number: Write the number in binary. Multiply each bit with 5 to the power
    Magic number 3 (011)= 0 X 5^3 + 1 X 5^2 + 1 X 5^1 = 30
     */
    public static void main(String[] args) {
        int n=6,last=0,sum=0, base=5;

        while (n>0){
            last= n&1;
            sum+=last * base;
            base= base * 5;
            n=n>>1;
        }
        System.out.println(sum);
    }
}

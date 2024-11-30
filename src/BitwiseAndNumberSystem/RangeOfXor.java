package BitwiseAndNumberSystem;

public class RangeOfXor {
    public static void main(String[] args) {

        //range of xor for a,b = xor(b) ^ xor(a-1)
        int a=3;
        int b=9;

        System.out.println("range of xor for 3 to 9 is "+((xor(b) ^ xor(a-1))));
    }
    public static int xor(int a){

        if(a% 4==0)
            return a;
        if(a% 4 ==1)
            return 1;
        if(a%4 ==2)
            return a+1;
        return 0;
    }
}

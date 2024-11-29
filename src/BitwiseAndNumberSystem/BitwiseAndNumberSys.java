package BitwiseAndNumberSystem;

public class BitwiseAndNumberSys {
    public static void main(String[] args) {
        //odd or even number
        oddOrEven(1);

        //find the unique value out of an array that has every number appearing twice except one number
        // A xor A =0   and A xor 0 = A
        int[] arr= {2,3,3,4,2,6,4,6,1};
        System.out.println(findUnique(arr));

    }

    public static void oddOrEven(int n){
        if((n&1) == 1)
            System.out.println("Odd number");
        else
            System.out.println("Even number");
    }

    public static int findUnique(int[] arr){
        int unique=0;

        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
}

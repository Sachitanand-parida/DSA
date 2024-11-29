package BitwiseAndNumberSystem;

public class PascalTriangle {
    //Find the sum of nth row of a pascal triangle= 2 ^ (n-1)
    public static void main(String[] args) {
        int row=5;
        System.out.println(1 << (row-1));  // a << b = a * (2 ^ b)
    }
}

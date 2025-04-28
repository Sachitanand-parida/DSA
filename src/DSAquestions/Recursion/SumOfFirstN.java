package DSAquestions.Recursion;

public class SumOfFirstN {
    public static void main(String[] args) {

        System.out.println(sumOfFirstN(5));
    }

    private static int sumOfFirstN(int num) {
        if(num==0)
            return 0;

        return num+ sumOfFirstN(num-1);
    }
}

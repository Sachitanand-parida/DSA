package OOPS;


public class Principles {
    public static void main(String[] args) {
        SumInterface s=(int a, int b)-> (a+b);
        int sum = s.sum(23, 3);
        System.out.println(sum);
    }
}

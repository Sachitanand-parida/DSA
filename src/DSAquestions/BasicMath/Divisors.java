package DSAquestions.BasicMath;

public class Divisors {
    public static void main(String[] args) {
        int[] nums={21,4,7};
        System.out.println(divisor(nums));

    }
    public static int divisor(int[] nums) {
        int totalSum = 0;
        for(int num:nums){
            int sum=0;
            int count=0;

            for (int i = 1; i*i < num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;

                    if (d1 == d2) {
                        count++;
                        sum = sum + d1;
                    }
                    count = count + 2;
                    sum = sum + d1 + d2;
                }
                if(count>4) break;

            }
            if(count==4)
                totalSum = totalSum + sum;

        }
        return totalSum;
    }
}

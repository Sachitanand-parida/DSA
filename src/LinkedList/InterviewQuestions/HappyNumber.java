package LinkedList.InterviewQuestions;

public class HappyNumber {
    /*
    Happy number 19:
    1^2 + 9^2 = 82
    8^2 + 2^2 = 68 ...

    ends up in value = 1

    Trick: this is a question to find the cyclic pattern of linkedList.
    If a number is not a happy number, it will form a cycle.
     */
    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }
    public static Boolean isHappy(int num){
        int slow= num;
        int fast= num;

        do{
            slow= findSquare(slow);                     //takes 1x step at a time
            fast= findSquare(findSquare(fast));         //takes 2x step at a time
        }while (slow != fast);

        if (slow == 1)
            return true;
        else
            return false;

    }
    private static int findSquare(int num){
        int ans= 0;
        while (num > 0){
            int rem= num%10;
            ans += rem * rem;
            num= num/10;
        }
        return ans;
    }
}

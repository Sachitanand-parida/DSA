package DSAquestions.BasicMath;

public class Palindrome {
    public static void main(String[] args) {

        //System.out.println(isPalindrome(121));
        //System.out.println(isPalindromeString("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeTwoPointer("madam"));
    }
    public static boolean isPalindrome(int x) {

        if(x<0 || (x%10 == 0 && x!= 0))
            return false;

        int rev=0;
        while(x>rev){
            rev= rev*10 + x%10;
            x= x/10;
        }
        return x == rev || x == rev / 10;
    }

    public static boolean isPalindromeString(String s) {

        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb= new StringBuilder(s).reverse();
        if(s.equals(sb.toString()))
            return true;
        else
            return false;
    }

    public static boolean isPalindromeTwoPointer(String str){

        str= str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0, end = str.length()-1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end --;
        }
        return true;
    }
}

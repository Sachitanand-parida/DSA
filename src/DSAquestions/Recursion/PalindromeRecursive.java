package DSAquestions.Recursion;

public class PalindromeRecursive {
    public static void main(String[] args) {

        String name= "123321";
        System.out.println(isPalindrome(name,0, name.length()-1));
    }

    private static boolean isPalindrome(String name, int start, int end) {
        if(start >= end)
            return true;

        if(name.charAt(start) != name.charAt(end))
            return false;

        return isPalindrome(name, start + 1, end-1);

    }
}

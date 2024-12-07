package RecursionSubsetPattern;

public class SkipCharInString {
    // given str= baccadb       ans= baadb

    public static void main(String[] args) {

        String str= "baccadb";
        System.out.println(skip(str,0,""));
        System.out.println(skip2(str));

        String s= "bad apple in my bag";
        System.out.println(skip3(s));
    }

     static String skip(String str, int i, String ans){

        if((i) ==str.length())
            return ans;

        if(str.charAt(i) != 'a') {
            ans = ans + str.charAt(i);
            return skip(str,i+1,ans);
        }
        return skip(str,i+1,ans);
     }

     static String skip2(String str){
        if(str.isEmpty())
            return "";

        char ch= str.charAt(0);

        if(ch=='a')
            return skip2(str.substring(1));
        else
            return ch+ skip2( str.substring(1));
     }

     //skip a word in the string
     //bad apple in my bag
    static String skip3(String str){
        if(str.isEmpty())
            return "";

        char ch= str.charAt(0);

        if(str.startsWith("apple"))
            return skip3(str.substring(5));
        else
            return ch+ skip3( str.substring(1));
    }
}

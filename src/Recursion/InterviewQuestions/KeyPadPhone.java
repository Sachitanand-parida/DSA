package Recursion.InterviewQuestions;

import java.util.ArrayList;

public class KeyPadPhone {
    public static void main(String[] args) {
        ArrayList<String> phone = phone("", "12");
        System.out.println(phone);
    }

    public static ArrayList<String> phone(String p, String up){

        if(up.isEmpty())    {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0';        //converts char '2' to integer 2

        ArrayList<String> list= new ArrayList<>();

        for (int i = (digit-1)*3; i < digit * 3; i++) {
            char ch= (char) ('a'+i);
            list.addAll(phone(p+ch,up.substring(1)));
        }
        return list;
    }
}

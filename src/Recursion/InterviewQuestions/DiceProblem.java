package Recursion.InterviewQuestions;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
        dice("",4);
        ArrayList<String> diceCombination = diceList("", 5);
        System.out.println(diceCombination);

    }
    public static void dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            dice(p+i, target-i);
        }
    }

    public static ArrayList<String> diceList(String p, int target){
        if (target == 0){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target; i++) {
            list.addAll(diceList(p+i, target-i));
        }
        return list;
    }
}

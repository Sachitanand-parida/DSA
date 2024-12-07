package RecursionSubsetPattern;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        //subset is for arrays
        //subsequence is for Strings
        String str= "abc";
        subSeq("",str);
        System.out.println(subSeqRet("",str));

        ArrayList<String> list= subSeqRetAscii("",str);
        System.out.println(list);
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){               //at the end of the tree, un-processed part is empty. Only the processed part is left.
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);

        subSeq(p,up.substring(1));
        subSeq(p+ch, up.substring(1));

    }

    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){               //at the end of the tree, un-processed part is empty. Only the processed part is left.
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);

        ArrayList<String> right= subSeqRet(p+ch, up.substring(1));
        ArrayList<String> left= subSeqRet(p,up.substring(1));

        left.addAll(right);
        return left;

    }
    static ArrayList<String> subSeqRetAscii(String p, String up){
        if(up.isEmpty()){               //at the end of the tree, un-processed part is empty. Only the processed part is left.
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);

        ArrayList<String> first= subSeqRetAscii(p+ch, up.substring(1));
        ArrayList<String> second= subSeqRetAscii(p,up.substring(1));
        ArrayList<String> third= subSeqRetAscii(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

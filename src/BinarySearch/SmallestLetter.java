package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {

        char[] ch={'a','b','d','j','k','l','y'};

        int result=smallLetter(ch,'z');
        System.out.println(ch[result]);

    }

    private static int smallLetter(char[] ch, char target) {
        int start=0,mid=0, end=ch.length-1;

        while(start<=end){

            mid=start+(end-start)/2;

            if(target<ch[mid])
                end=mid-1;
            else if (target>ch[mid])
                start=mid+1;
            else return  mid;

        }
        return start % ch.length;       //char gets wrap around so we need to use this logic
    }
}

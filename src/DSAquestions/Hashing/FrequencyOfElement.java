package DSAquestions.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr= {10,5,10,15,15,15};

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        System.out.println(max);
    }
}

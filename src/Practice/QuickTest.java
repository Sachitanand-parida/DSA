package Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QuickTest {
    public static void main(String[] args) {
        int[] arr= {1,2,2,2,3,4,5};
        Arrays.sort(arr);

        int currentFreq=1, maxFreq=1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]== arr[i-1])
                currentFreq++;
            else
                currentFreq=1;

            maxFreq= Math.max(maxFreq, currentFreq);
        }
        System.out.println(maxFreq);

         }
    }


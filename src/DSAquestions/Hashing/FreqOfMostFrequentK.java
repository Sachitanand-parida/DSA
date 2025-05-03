package DSAquestions.Hashing;

import java.util.Arrays;

public class FreqOfMostFrequentK {
    public static void main(String[] args) {

        int[] nums= {1,4,8,13};
        int k=5;
        Arrays.sort(nums);
        int left=0, right, maxFreq=0, total=0;

        for ( right = 0; right < nums.length; right++) {
            total += nums[right];

            // total increments needed to make all elements in window equal to nums[right]
            while ((long)(right - left + 1) * nums[right] - total > k) {
                total -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }
    }
}

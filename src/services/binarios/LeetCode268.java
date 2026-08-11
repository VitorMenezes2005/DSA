package services.binarios;

public class LeetCode268 {
    public static int missingNumber(int[] nums){
        int x = 0;

        for(int num : nums){
            x ^= num;
        }

        for(int i=0; i<=nums.length; i++){
            x ^= i;
        }

        return x;
    }
}

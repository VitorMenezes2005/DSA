package services.arrays;

import java.util.HashMap;
import java.util.Map;

public class LeetCode001 {
    public static int[] twoSun(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];

            if(map.containsKey(x)){
                int[] ind = new int[2];
                ind[0] = map.get(x);
                ind[1] = i;
                return ind;
            }

            map.put(nums[i],i);
        }

        return new int[0];
    }
}

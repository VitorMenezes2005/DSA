package services;

import java.util.HashMap;
import java.util.Map;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2){
        Map<Integer, Integer> seen1 = new HashMap<>();
        Map<Integer, Integer> seen2 = new HashMap<>();

        for(Integer n : nums1){
            if(!seen1.containsKey(n)){
                seen1.put(n, 1);
            }
        }

        for(Integer n : nums2){
            if(seen1.containsKey(n)){
                seen2.put(n, 1);
            }
        }

        int[] result = new int[seen2.size()];

        int i = 0;
        for(Integer n : seen2.keySet()){
            result[i] = n;
            i++;
        }

        return result;

    }
}

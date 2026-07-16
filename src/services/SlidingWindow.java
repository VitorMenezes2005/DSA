package services;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    public static int slidingWindow(String s){
        Map<Character, Integer> result = new HashMap<>();
        char[] array = s.toCharArray();
        int l = 0;
        int r = 0;
        int max = 1;

        result.put(array[0], 1);

        while(r < array.length - 1){
            r++;

            if(result.containsKey(array[r])){
                result.put(array[r], result.get(array[r]) + 1);
            }else{
                result.put(array[r], 1);
            }

            while(result.get(array[r]) == 3){
                result.put(array[l], result.get(array[l]) - 1);
                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        System.out.println(max);

        return max;
    }
}

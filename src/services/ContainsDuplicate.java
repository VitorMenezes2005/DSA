package services;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static Boolean containsDuplicate(int[] array){
        Map<Integer, Integer> result = new HashMap<>();

        for(Integer i : array){
            if(result.containsKey(i)){
                return true;
            }else{
                result.put(i, 1);
            }
        }

        return false;
    }
}

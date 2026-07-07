package services;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMaps {

    public static Map<Character, Integer> frequencyMap(String s){
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch) + 1);
            }else{
                freq.put(ch, 1);
            }
        }

        return freq;
    }
}

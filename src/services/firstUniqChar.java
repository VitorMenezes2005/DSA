package services;

import java.util.HashMap;
import java.util.Map;

public class firstUniqChar {
    public static int firstUniqChar (String s){
        Map<Character, int[]> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int x = 0;

        for(int i=0; i<chars.length; i++){
            if(!map.containsKey(chars[i])){
                map.put(chars[i], new int[]{i, 1});
            }else{
                int[] dados = map.get(chars[i]);
                dados[1]++;
            }
        }

        for(Character ch : chars){
            int[] result = map.get(ch);
            if(result[1] == 1){
                return result[0];
            }
        }

        return -1;
    }
}

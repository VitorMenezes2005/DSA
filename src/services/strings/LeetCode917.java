package services.strings;

public class LeetCode917 {
    public static String reverseOnlyLetters(String s){
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length -  1;

        while(l < r){
            if(Character.isLetter(chars[l]) && Character.isLetter(chars[r])){
                char ch = chars[l];
                chars[l] = chars[r];
                chars[r] = ch;
                l++;
                r--;
            }else if(Character.isLetter(chars[l])){
                r--;
            }else if(Character.isLetter(chars[r])){
                l++;
            }else{
                l++;
                r--;
            }
        }

        String a = new String(chars);

        return a;
    }


}

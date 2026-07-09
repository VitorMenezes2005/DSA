package services;

public class TwoPointer {
    public static String letras(String s){
        char[] frase = s.toCharArray();

        int l = 0;
        int r = 0;

        for(int i=0; i<frase.length; i++){
            if(frase[i] == ' '){
                r = i - 1;

                while(l < r){
                    char motor = frase[r];
                    frase[r] = frase[l];
                    frase[l] = motor;
                    l++;
                    r--;
                }

                l = i + 1;

            }else{
                r = i;
            }
        }

        while(l < r){
            char motor = frase[r];
            frase[r] = frase[l];
            frase[l] = motor;
            l++;
            r--;
        }



        return new String(frase);
    }
}

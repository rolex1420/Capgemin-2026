package M1;

import java.util.*;

public class Anagrams {
    static void main(String[] args) {
        String s1="biuld";
        String s2="dubli";
        if(s1.length()!=s2.length()){
            System.out.println(false);
            return;
        }
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}

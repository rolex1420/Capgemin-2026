package M1;
import java.util.*;
public class MaxOccuring {
    static void main(String[] args) {
        String s="abcdd";
        Map<Character,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(int n:mp.values()){
            if(ans<n){
                ans=n;
            }
        }
        int c=0;
        for(int n:mp.values()){
            if(ans==n){
                c++;
            }
        }
        if(c>1){
            System.out.println("0");
        }else
        System.out.println(ans);
    }
}

import java.util.*;
public class LUniqueSubstring {
    static void main(String[] args) {
        String s="abcabcbb";
        int ans=0;
        Map<Character,Integer> m=new HashMap<>();
        int i=0,j=0;
        while(j<s.length()){
            if(m.containsKey(s.charAt(j))){
                i=Math.max(i,m.get(s.charAt(j))+1);
            }
                m.put(s.charAt(j),j);
            ans=Math.max(ans,j-i+1);
            j++;
        }
        System.out.println(ans);
    }
}

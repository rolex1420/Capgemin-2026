package M1;
import java.util.*;
public class RemoveDuplicate {
    static void main(String[] args) {
        String s="aabbccgeef";
        Set<Character> st=new HashSet<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                ans+=s.charAt(i);
            }
            st.add(s.charAt(i));
        }
        System.out.println(ans);
    }
}

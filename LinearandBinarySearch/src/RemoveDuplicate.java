import java.util.HashSet;

public class RemoveDuplicate {
    static void main(String[] args) {
        String s="aasbbcddrt";
        HashSet<Character> hs=new HashSet<>();
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                ans.append(s.charAt(i));
                hs.add(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}

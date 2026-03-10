package M1;

public class CompressWord {
    static void main(String[] args) {
        String s="asdfghjklpo";
        String ans=""+s.charAt(0);
        ans+=s.length()-2;
        ans+=s.charAt(s.length()-1);
        System.out.println(ans);

    }
}

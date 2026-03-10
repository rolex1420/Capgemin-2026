package M1;

public class RepeatString {
    static void main(String[] args) {
        int n=3;
        String s="abc";
        String ans="";
        for(int i=1;i<=n;i++){
            ans+=s;
        }
        System.out.println(ans);
    }
}

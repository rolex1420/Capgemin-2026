package M1;

public class CaesarCipher {
    static void main(String[] args) {
        String s="nrfzh";
        String ans="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int n=c-'a';
            n=n+3;
            if(n>26){
                n=n-26;
                ans+=(char)(n+'a');
            }else{
                ans+=(char)(n+'a');
            }

        }
        System.out.println(ans);
    }
}

package M1;

public class Convert {
    static void main(String[] args) {
        String s="aBpDe";
        int u=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                l++;
            }else{
                u++;
            }
        }
        String ans="";
        if(u>l){
            ans=s.toUpperCase();
        }else{
            ans=s.toLowerCase();
        }
        System.out.println(ans);
    }
}

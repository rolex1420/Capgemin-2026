package M1;

public class EncodedFrom {
    static void main(String[] args) {
        String s="101101110";
        String ans="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                char c= (char) ('A'+(count-1));
                ans+=c;
                count=0;
            }else{
                count++;
            }
        }
        if(count!=0){
            char c=(char)(count+64);
            ans+=c;
        }
        System.out.println(ans);
    }
}

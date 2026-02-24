public class StringMarge {
    static void main(String[] args) {
        String s = "abcd", a = "xyz";
        int i = 0;
        String ans = "";
        while (i < s.length() && i < a.length()) {
            ans+=s.charAt(i);
            ans+=a.charAt(i);
            i++;
        }
        while(i < s.length()){
            ans+=s.charAt(i);
            i++;
        }
        while(i < a.length()){
            ans+=a.charAt(i);
            i++;
        }
        System.out.println(ans);
    }
}

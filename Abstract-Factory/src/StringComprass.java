public class StringComprass {
    static void main(String[] args) {
        String s="aaabbbccdd";
        int c=0;
        char v=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==v){
                c++;
            }else{
                System.out.print(v);
                System.out.print(c);
                v=s.charAt(i);
                c=1;
            }
        }
        System.out.print(v);
        System.out.print(c);
    }
}

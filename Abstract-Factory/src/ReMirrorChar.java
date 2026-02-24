public class ReMirrorChar {
    static void main(String[] args) {
        String s="bacab";
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) {
                System.out.println(false);
                return;
            }
            i++;
            j--;
        }
        if(s.length()%2==0)
            System.out.println(s.substring(0,i));
        else
            System.out.println(s.substring(0,i+1));
    }
}

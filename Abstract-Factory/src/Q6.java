public class Q6 {
    static boolean palindrome(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    static void main(String[] args) {
        String s="aabc";
        int i=s.length()-1;
        s+=s;
        int j=0;
        for(;i<s.length();i++){
            if(palindrome(j,i,s)){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}

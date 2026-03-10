package M1;

public class Reverse_A_Number {
    static void main(String[] args) {
        int n=23010;
        int ans=0;
        while(n>0){
            int v=n%10;
            n=n/10;
            if(!(ans==0 && v==0)){
               ans=ans*10+v;
            }
        }
        System.out.println(ans);
    }
}

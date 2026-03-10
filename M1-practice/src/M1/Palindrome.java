package M1;

public class Palindrome {
    static void main(String[] args) {
        String s="this is level 11";
        String arr[]=s.split("\\s+");
        int count=0;
        for(int i=0;i<arr.length;i++){
            int l=0,h=arr[i].length()-1;
            int temp=0;
            while(l<h){
                if(arr[i].charAt(l)!=arr[i].charAt(h)){
                    temp++;
                    break;
                }
                l++;
                h--;
            }
            if(temp==0)count++;
        }
        System.out.println(count);
    }
}

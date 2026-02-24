public class ReverseS {
    static void main(String[] args) {
        String s="i  love java programing very march";
        String arr[]=s.split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                char ca[]=arr[i].toCharArray();
                int q=0,p=ca.length-1;
                while(q<p){
                    char v=ca[p];
                    ca[p]=ca[q];
                    ca[q]=v;
                    q++;
                    p--;
                }
                arr[i]=new String(ca);
            }
        }
        s=String.join(" ",arr);
        System.out.println(s);
    }
}

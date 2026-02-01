public class Concatenate {
    static void main(String[] args) {
        StringBuffer ans=new StringBuffer();
        String arr[]={"sura","duary","anand","gopal"};
        for(int i=0;i<arr.length;i++){
            ans.append(arr[i]);
        }
        System.out.println(ans);
    }
}

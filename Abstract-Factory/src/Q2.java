import java.util.Arrays;

public class Q2 {
    static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50,60};
        int v;
        if(arr.length%2==0){
            v=arr[arr.length-2];
        }else{
            v=arr[arr.length-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            if(i%2==0&&i-2>=0)
                arr[i]=arr[i-2];
        }
        arr[0]=v;
        System.out.println(Arrays.toString(arr));
    }
}

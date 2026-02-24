import java.util.Arrays;

public class Q1 {
    static void main(String[] args) {
        int arr[]=new int[]{5,2,9,1,2,6};
        for(int i=1;i<arr.length;i+=2){
            if(arr[i-1]>arr[i]){
                int v=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=v;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

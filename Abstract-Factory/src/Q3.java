import java.util.*;
public class Q3 {
    static void main(String[] args) {
        int arr[]=new int[]{1,2,2,3,4,2,10};
        int i=1,j=arr.length-2;
        int v1=arr[0],v2=arr[arr.length-1];
        while(i<=j){
            if(v1>v2){
                v2+=arr[j];
                j--;
            }else{
                v1+=arr[i];
                i++;
            }
        }
        System.out.println(v1==v2);


    }
}

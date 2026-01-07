import java.util.*;
public class CheckNumber {
    public static  void main(String[] args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("Zero");
            }else if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println("even");
                }else{
                    System.out.println("Odd");
                }
            }else{
                System.out.println("negative");
                System.out.println();
            }
        }
        if(arr[0]==arr[arr.length-1])
            System.out.println("they are equal");

    }
}

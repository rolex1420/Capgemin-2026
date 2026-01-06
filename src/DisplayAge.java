import java.util.*;
public class DisplayAge {
    public static void main(String[] args){
        int arr[]=new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("an invalid age");
            }else if(arr[i]>=18){
                System.out.println("The student with the age "+arr[i]+" can vote");
            }else{
                System.out.println("The student with the age "+arr[i]+" cannot vote");
            }
        }
    }
}

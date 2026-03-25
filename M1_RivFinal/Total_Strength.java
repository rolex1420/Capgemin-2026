package M1_RivFinal;

import java.util.*;

public class Total_Strength {
    static void main(String[] args) {
        int arr[]=new int[]{1,2,10,5,9,9};
        int arr1[]=new int[]{2,1,3};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int c=arr.length-1;
        int sum=0;
        for(int i=0;i<arr1.length && c>=0;i++){
            int max=arr[c],min=0;
            for(int j=1;j<=arr1[i] && c>=0;j++){
                min=arr[c];
                c--;
            }
            sum+=max+min;
        }
        System.out.println(sum);
    }
}

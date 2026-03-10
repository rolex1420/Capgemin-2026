package M1;

public class FindMidIndex {
    static void main(String[] args) {
        int arr[]=new int[]{1,-2,-3,4,-5,6};
        int l=0,h=arr.length-1;
        int ans=0;
        while(l<=h){
            if(arr[l]<0 || arr[h]<0){
                if(arr[l]<0){
                    l++;
                }else{
                    h--;
                }
            }else{
                ans=arr[l];
                l++;
                h--;
            }
        }
        System.out.println(ans);
    }
}

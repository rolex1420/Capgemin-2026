package M1;

public class FindMissingNumber {
    static void main(String[] args) {
        int arr[]=new int[]{1,2,5,6,3,7,8};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        n+=1;
        int sum2=(n*(n+1))/2;
        System.out.println(sum2-sum);
    }
}

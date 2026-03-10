package M1;

public class HikeTrial {
    static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,3,2,1};
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                System.out.println(arr[i-1]);
                return;
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}

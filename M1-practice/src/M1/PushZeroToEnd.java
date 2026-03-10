package M1;

public class PushZeroToEnd {
    static void main(String[] args) {
        int arr[]=new int[]{0,5,0,7,0,6};
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                int j=i+1;
                while(j<arr.length && arr[j]!=0){
                    arr[j-1]=arr[j];
                    j++;
                }
                if(j!=i+1){
                    arr[j-1]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}

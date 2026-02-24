public class Q4 {
    static void main(String[] args) {
        int arr[]=new int[]{2,7,3,1,9};
        int v=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>v){
                    v=arr[j]-arr[i];
                }
            }
        }
        System.out.println(v);
    }
}

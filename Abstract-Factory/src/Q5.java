public class Q5 {
    static void main(String[] args) {
        int arr[]=new int[]{16,17,17,4,3,5,2};
        int m=arr[arr.length-1];
        System.out.println(m);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>m){
                System.out.println(arr[i]);;
                m=arr[i];
            }
        }

    }
}

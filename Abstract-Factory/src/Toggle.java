public class Toggle {
    static void main(String[] args) {
        String s="javA programing";
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' ') {
                if (i % 2 == 0) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }
        }
        s=new String(arr);
        System.out.println(s);
    }
}

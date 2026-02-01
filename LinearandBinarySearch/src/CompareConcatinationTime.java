public class CompareConcatinationTime {
    static void main(String[] args) {
        int n = 1_000_000;
        StringBuilder sb=new StringBuilder();
        long startsd=System.nanoTime();
        for(int i=1;i<n;i++){
            sb.append("hello");
        }
        long endsd=System.nanoTime();
        System.out.println(endsd-startsd);

        StringBuffer sf=new StringBuffer();
        long startsf=System.nanoTime();
        for(int i=1;i<n;i++){
            sb.append("hello");
        }
        long endsf=System.nanoTime();
        System.out.println(endsf-startsf);
    }
}

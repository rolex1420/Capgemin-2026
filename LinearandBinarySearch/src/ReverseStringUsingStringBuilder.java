import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder(s);
        s1.reverse();
        String ans=s1.toString();
        System.out.println(ans);

    }
}

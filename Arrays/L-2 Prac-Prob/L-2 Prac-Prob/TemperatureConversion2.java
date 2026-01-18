
import java.util.Scanner;
public class TemperatureConversion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The "+fahrenheit+" fahrenheit is "+celsius);
    }
}
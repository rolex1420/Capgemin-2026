import java.util.Scanner;

class SimpleInterestCalculator {

    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();

        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
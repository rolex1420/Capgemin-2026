import java.util.Scanner;

class TriangularParkRun {

    public int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangularParkRun parkRun = new TriangularParkRun();

        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        int rounds = parkRun.calculateRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + rounds + " rounds");
    }
}
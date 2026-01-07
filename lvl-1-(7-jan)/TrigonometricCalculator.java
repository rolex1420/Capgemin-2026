import java.util.Scanner;

class TrigonometricCalculator {
    
    


    public double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        double angle = scanner.nextDouble();

        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
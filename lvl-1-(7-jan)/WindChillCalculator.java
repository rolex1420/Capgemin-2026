import java.util.Scanner;

class WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WindChillCalculator calculator = new WindChillCalculator();

        double temperature = scanner.nextDouble();
        double windSpeed = scanner.nextDouble();

        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature: " + windChill);
    }
}
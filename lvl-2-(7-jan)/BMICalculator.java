import java.util.Scanner;

class BMICalculator {

    




    public void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;
        }
    }

    public String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMICalculator calculator = new BMICalculator();
        
        // Rows = 10 persons, Cols = 0:Weight, 1:Height, 2:BMI
        double[][] personData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            personData[i][0] = scanner.nextDouble(); // Weight
            personData[i][1] = scanner.nextDouble(); // Height
        }

        calculator.calculateBMI(personData);

        for (int i = 0; i < 10; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = personData[i][2];
            String status = calculator.getBMIStatus(bmi);
            
            System.out.println("Person " + (i + 1) + ": Height=" + height + "cm, Weight=" + weight + "kg, BMI=" + bmi + ", Status=" + status);
        }
    }
}
class RandomNumberStats {

    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        double min = numbers[0];
        double max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomNumberStats stats = new RandomNumberStats();

        int[] randomNumbers = stats.generate4DigitRandomArray(5);

        System.out.print("Generated Numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] results = stats.findAverageMinMax(randomNumbers);

        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
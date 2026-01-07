import java.util.Scanner;

class FriendStats {

    public int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        return youngest;
    }

    public double findTallest(double[] heights) {
        double tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FriendStats stats = new FriendStats();

        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            ages[i] = scanner.nextInt();
            heights[i] = scanner.nextDouble();
        }

        int youngestAge = stats.findYoungest(ages);
        double tallestHeight = stats.findTallest(heights);

        System.out.println("Youngest Age: " + youngestAge);
        System.out.println("Tallest Height: " + tallestHeight);
    }
}
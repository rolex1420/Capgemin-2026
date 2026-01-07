import java.util.Scanner;

class ChocolateDistribution {

    public int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChocolateDistribution distributor = new ChocolateDistribution();

        int numberOfChocolates = scanner.nextInt();
        int numberOfChildren = scanner.nextInt();

        int[] results = distributor.distributeChocolates(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets: " + results[0]);
        System.out.println("Remaining chocolates: " + results[1]);
    }
}
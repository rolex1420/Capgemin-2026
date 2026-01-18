import java.util.Scanner;

class SampleProgramRe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();
        double distanceFromToVia = input.nextDouble();
        int hours1 = input.nextInt();
        int mins1 = input.nextInt();
        int timeFromToVia = (hours1 * 60) + mins1;
        double distanceViaToFinalCity = input.nextDouble();
        int hours2 = input.nextInt();
        int mins2 = input.nextInt();
        int timeViaToFinalCity = (hours2 * 60) + mins2;

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("\n--- Travel Details ---");
        System.out.println("The Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " km and " +
                           "the Total Time taken is " + totalTime + " minutes");
    }
}

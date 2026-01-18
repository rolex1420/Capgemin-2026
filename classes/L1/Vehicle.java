import java.util.Scanner;

class Vehicle {
    static double registrationFee = 1500.0;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println(v.ownerName);
            System.out.println(v.vehicleType);
            System.out.println(v.registrationNumber);
            System.out.println(registrationFee);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String owner = sc.nextLine();
        String type = sc.nextLine();
        String reg = sc.nextLine();

        Vehicle v = new Vehicle(owner, type, reg);
        v.display(v);
    }
}

import java.util.Scanner;

class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static int getTotalPatients() {
        return totalPatients;
    }

    void display(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println(hospitalName);
            System.out.println(p.name);
            System.out.println(p.age);
            System.out.println(p.ailment);
            System.out.println(p.patientID);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String ailment = sc.nextLine();
        int id = sc.nextInt();

        Patient p = new Patient(name, age, ailment, id);
        p.display(p);
        System.out.println(getTotalPatients());
    }
}

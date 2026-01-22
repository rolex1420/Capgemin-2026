// Patient.java
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(name + " Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient {
    private int days;

    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.days = days;
    }

    public double calculateBill() {
        return days * 2000;
    }
}

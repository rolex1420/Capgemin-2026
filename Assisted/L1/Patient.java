import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        p.name.length();
    }
}

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
}

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Sen");
        Patient p = new Patient("Rohit");

        d.consult(p);
    }
}

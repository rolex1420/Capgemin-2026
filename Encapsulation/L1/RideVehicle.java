// RideVehicle.java
abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(driverName + " - " + vehicleId);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Auto extends RideVehicle {
    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}

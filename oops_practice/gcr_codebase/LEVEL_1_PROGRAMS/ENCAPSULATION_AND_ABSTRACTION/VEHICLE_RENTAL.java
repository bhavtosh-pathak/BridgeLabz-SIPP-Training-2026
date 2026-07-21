abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;


    // Constructor
    Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }


    // Getter and Setter methods

    public String getVehicleNumber() {
        return vehicleNumber;
    }


    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }


    public String getVehicleType() {
        return vehicleType;
    }


    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


    // Display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }


    // Abstract method
    abstract double calculateRentalCost(int days);

}



// Car Class
class Car extends Vehicle {

    private double dailyRate;


    Car(String vehicleNumber, String vehicleType, double dailyRate) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }


    public double getDailyRate() {
        return dailyRate;
    }


    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }


    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }

}



// Bike Class
class Bike extends Vehicle {

    private double dailyRate;


    Bike(String vehicleNumber, String vehicleType, double dailyRate) {
        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
    }


    public double getDailyRate() {
        return dailyRate;
    }


    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }


    @Override
    double calculateRentalCost(int days) {
        return days * dailyRate;
    }

}



// Truck Class
class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;


    Truck(String vehicleNumber, String vehicleType,
          double dailyRate, double loadingCharge) {

        super(vehicleNumber, vehicleType);
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }


    public double getDailyRate() {
        return dailyRate;
    }


    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }


    public double getLoadingCharge() {
        return loadingCharge;
    }


    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }


    @Override
    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }

}



// Main Class
public class Main {

    public static void main(String[] args) {


        Car car = new Car("DL01AB1234", "Car", 2000);

        Bike bike = new Bike("DL02CD5678", "Bike", 1000);

        Truck truck = new Truck("DL03EF9876", "Truck", 5000, 3000);


        int days = 5;


        System.out.println("----- Car Details -----");
        car.displayVehicleDetails();
        System.out.println("Rental Cost: "
                + car.calculateRentalCost(days));


        System.out.println("\n----- Bike Details -----");
        bike.displayVehicleDetails();
        System.out.println("Rental Cost: "
                + bike.calculateRentalCost(days));


        System.out.println("\n----- Truck Details -----");
        truck.displayVehicleDetails();
        System.out.println("Rental Cost: "
                + truck.calculateRentalCost(days));

    }
}
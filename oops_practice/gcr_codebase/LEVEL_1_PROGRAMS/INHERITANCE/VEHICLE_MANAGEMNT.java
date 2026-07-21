class Vehicle {

    String model;
    int maxSpeed;


    Vehicle(String model, int maxSpeed) {

        this.model = model;
        this.maxSpeed = maxSpeed;
    }


    void displayVehicle() {

        System.out.println("Model: " + model);
        System.out.println("Maximum Speed: " + maxSpeed);
    }
}



// Interface
interface Refuelable {

    void refuel();
}



// Electric Vehicle
class ElectricVehicle extends Vehicle {


    ElectricVehicle(String model, int speed) {

        super(model, speed);
    }


    void charge() {

        System.out.println("Vehicle is charging...");
    }
}



// Petrol Vehicle
class PetrolVehicle extends Vehicle implements Refuelable {


    PetrolVehicle(String model, int speed) {

        super(model, speed);
    }


    public void refuel() {

        System.out.println("Vehicle is refueling...");
    }
}



// Main Class
public class VEHICLE_MANAGEMNT {

    public static void main(String[] args) {


        ElectricVehicle electric =
                new ElectricVehicle("Tesla Model 3", 250);


        PetrolVehicle petrol =
                new PetrolVehicle("Toyota Fortuner", 180);



        System.out.println("Electric Vehicle Details");
        electric.displayVehicle();
        electric.charge();



        System.out.println("\nPetrol Vehicle Details");
        petrol.displayVehicle();
        petrol.refuel();

    }
}
package StaticEx;

public class Vehicle {
    private String name;
    private String model;
    private static int totalVehicles;

    Vehicle(String n, String m) {
        this.name = n;
        this.model = m;
        totalVehicles++;
    }

    public static int getVehicleNumber() {
        return totalVehicles;
    }


    public static void main(String[] args) {
        new Bike("KTM","Duke");
        new Bike("Bajaj", "Yamaha");

        new NewCar("Bugatti", "Veyron");

        System.out.println("Total Vehicles : ");
        System.out.println(Vehicle.getVehicleNumber());
    }
}

class Bike extends Vehicle {
    private static int bikeNo;

    private String name;
    private String model;

    Bike(String name, String model) {
        super(name, model);
        bikeNo++;
    }
}

class NewCar extends Vehicle {
    private String name;
    private String model;

    private static int carNo;

    NewCar(String name, String model) {
        super(name, model);
        carNo++;
    }
}

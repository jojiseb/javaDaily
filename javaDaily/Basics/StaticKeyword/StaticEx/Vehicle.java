package StaticEx;

public class Vehicle {
    private String name;
    private String model;
    private static int totalVehicles;

     protected Vehicle(String n, String m) {
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

        System.out.println("No. of Bikes : "+Bike.getBikeNo());
        new NewCar("Bugatti", "Veyron");
        System.out.println("No. of Cars : "+NewCar.getCarNo());

        System.out.println("Total Vehicles : ");
        System.out.println(Vehicle.getVehicleNumber());

    }
}

class Bike extends Vehicle {
    private static int bikeNo;
    Bike(String name, String model) {
        super(name, model);
        bikeNo++;
    }
    public static int getBikeNo() {
        return bikeNo;
    }
}

class NewCar extends Vehicle {
    private static int carNo;

    NewCar(String name, String model) {
        super(name, model);
        carNo++;
    }
    public static int getCarNo() {
        return carNo;
    }
}

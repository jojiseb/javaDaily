package objectAndClass;

interface Vehicle {
    String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlarmOn() { //Default methods were introdyced to avoid a common implementation
        return "Turn the vehicle alarm on !"; //in every sub-classes when adding a method in interface
    }                                       //As a default implementation added to interface is automatically
    default String turnAlarmOff() {         //act as implemented for sub-classes without need to manually implement
        return "Turn Vehicle alarm Off !";
    }
}

class CarTest implements Vehicle {
    private String brand;

    public CarTest(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() { //interface methods by default public, so methods implemented must be public
        return brand;
    }
    @Override
    public String speedUp() {
        return "Car is speeding up";
    }
    @Override
    public String slowDown() {
        return "Car is slowing down";
    }
}

class BikeTest implements Vehicle {
    private String brand;
    public BikeTest(String brand){
        this.brand = brand;
    }
    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public String speedUp() {
        return "Bike is sped up";
    }
    @Override
    public String slowDown() {
        return "Bike is slow down";
    }
}

public class DefaultTest {
    public static void main(String[] args) {
        Vehicle vehicle = new CarTest("BMW");
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());
        System.out.println(vehicle.turnAlarmOn()); //Default implementation is automatically
        System.out.println(vehicle.turnAlarmOff()); //available to all sub-classes

        System.out.println();
        Vehicle vehicle1 = new BikeTest("Harley Davidson");
        System.out.println(vehicle1.getBrand());
        System.out.println(vehicle1.speedUp());
        System.out.println(vehicle1.slowDown());
        System.out.println(vehicle1.turnAlarmOn());
        System.out.println(vehicle1.turnAlarmOff());
    }
}

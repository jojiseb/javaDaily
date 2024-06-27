package objectAndClass;

abstract class VehicleTest {
    protected abstract void start();
    protected abstract void stop();

    protected abstract void drive();

    protected abstract void changeGear();
    protected abstract void reverse();
}

class CarTake extends VehicleTest { //is-a relationship, so using "extends"
    @Override
    protected void start() {
        System.out.println("Car is starting");
    }
    @Override
    protected void stop() {
        System.out.println("Car is stopping");
    }
    @Override
    protected void drive() {
        System.out.println("Driving a Car");
    }
    @Override
    protected void changeGear() {
        System.out.println("Gear up on Car");
    }
    @Override
    protected void reverse() {
        System.out.println("Car is taking reverse");
    }
}

class BikeTake extends VehicleTest {
    @Override
    protected void start() {
        System.out.println("Bike is starting");
    }
    @Override
    protected void changeGear() {
        System.out.println("Shifting gears");
    }
    @Override
    protected void drive() {
        System.out.println("Started driving a bike");
    }
    @Override
    protected void stop() {
        System.out.println("Stopping bike");
    }
    @Override
    protected void reverse() {
        System.out.println("Reversing the bike");
    }
}

public class VehicleCheck {
    public static void main(String[] args) {
        VehicleTest car = new CarTake();
        car.start();
        car.changeGear();
        car.drive();
        car.stop();
        car.reverse();

        System.out.println();

        VehicleTest bike = new BikeTake();
        bike.start();
        bike.changeGear();
        bike.drive();
        bike.stop();
        bike.reverse();
    }
}

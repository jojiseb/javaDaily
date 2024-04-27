package StaticEx;

public class Car {
    private String name;
    private String engine;
    private static int numberOfCars; //numberOfCars belongs to className or type rather than the instance OR Independent of objects
                                    //But value is shared across all the instances
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        Car.numberOfCars++; //Since, they belong to class, we don't need this
    }               //directly access using Class Name

    public int carNumber() {
        return Car.numberOfCars;
    }

    public static void main(String[] args) {
        System.out.println("Number check : "+Car.numberOfCars); //0
        System.out.println("Number of cars : "+new Car("Innova", "Toyota").carNumber()); //1
        Car car = new Car("Benz C-class", "Mercedez");
        System.out.println("Number of cars : "+car.carNumber()); //2

        //We must avoid using object reference to access static fields, because it causes confusion whether its class or instance variable
    }
}

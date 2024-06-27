package StaticEx;

class CarTest {
    private String name;
    private String engine;

    public void setName(String name) {
        this.name = name;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getName() {
        return name;
    }
    public String getEngine() {
        return engine;
    }

    public static void carDetails(CarTest carTest) {
        System.out.println("Car details are : ");   //Using an object of class which contains
        System.out.println(carTest.getName()+", "+carTest.getEngine()); //instance methods, in order to access
    }   //instance methods in a static context
}

public class StaticTest2 {
    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        carTest.setName("BMW");
        carTest.setEngine("BS6");
        CarTest.carDetails(carTest);
    }
}

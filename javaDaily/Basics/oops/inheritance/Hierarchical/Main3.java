package inheritance.Hierarchical;

class Vehicle {
    double basePrice = 10000;

    void showPrice() {
        System.out.println("Base price of vehicle : "+basePrice);
    }
}

class TwoWheeler extends Vehicle {

    double increasePriceBy = 0.20;
    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println("Final price of the Bike : "+basePrice);
    }
}

class FourWheeler extends Vehicle {
    double increasePriceBy = 1;

    void finalPrice() {
        basePrice = basePrice + (basePrice * increasePriceBy);
        System.out.println("Final price of Car : "+basePrice);
    }
}

public class Main3 {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        bike.showPrice();
        bike.finalPrice();

        FourWheeler car = new FourWheeler();
        car.showPrice();
        car.finalPrice();
    }
}

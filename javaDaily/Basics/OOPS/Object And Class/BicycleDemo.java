public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle one = new Bicycle();
        Bicycle two = new Bicycle();

        System.out.println("Initial Details of Bicycles : ");
        one.printStates();
        two.printStates();

        System.out.println("Updating states...");

        one.changeGear(4);
        one.changeCadence(50);
        one.speedUp(80);

        one.printStates();

        two.changeGear(3);
        two.changeCadence(70);
        two.speedUp(60);

        two.printStates();

        System.out.println("After applying brakes...");

        one.applyBrakes(20);
        two.applyBrakes(10);

        one.printStates();
        two.printStates();
    }
}

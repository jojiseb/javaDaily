
interface Runnable {
    void run();
}

interface Swimmable {
    void swim();
}

class Frog implements Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("Frog can run");
    }

    @Override
    public void swim() {
        System.out.println("Frog can swim");
    }
}

class Penguin implements Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("Penguin can run");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}

public class LandAndWaterAnimal {
    public static void main(String[] args) {
        Runnable runnable = new Penguin(); //Using interface types Runnable, Swimmable for reference variables
        runnable.run(); //So, the code can work with any classes that implement these interfaces

        Swimmable swimmable = new Frog(); //This is polymorphism, where single reference can point to different
        swimmable.swim(); //implementations at run-time

        runnable = new Frog(); //This approach provides flexibility where same interface reference can point to
        runnable.run(); //different objects

        swimmable = new Penguin();
        swimmable.swim(); //Another advantage is you don't need to modify existing code, but rather add new classes
                    //that implement them.

        //Eg : If new class called Duck implemented, then it will be added as
        //runnable = new Duck();
        //swimmable = new Duck();

        //which will be newly added code. It won't edit or modify existing code

        //So, This is easily maintainable system rather than using specific implementation
    }
}

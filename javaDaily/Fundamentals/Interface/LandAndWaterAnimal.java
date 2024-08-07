
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
        Runnable runnable = new Penguin();
        runnable.run();

        Swimmable swimmable = new Frog();
        swimmable.swim();

        runnable = new Frog();
        runnable.run();

        swimmable = new Penguin();
        swimmable.swim();
    }
}

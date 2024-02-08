package inheritance.Multiple;

interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear eating plants..");
    }
    public void eatMeat() {
        System.out.println("Bear eating meat");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatPlants();
        bear.eatMeat();
    }
}

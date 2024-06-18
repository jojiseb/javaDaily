package StaticEx;

class AnimalTest {
    void feed() {
        System.out.println("Feeding animal");
    }
}
class Lion extends AnimalTest {
    void roar() {
        System.out.println("Grrrrrrrr");
    }
}
public class AnimalEx {
    public static void main(String[] args) {
        Lion lion = new Lion(); //Using SubClass obj = new SubClass()
        lion.feed();
        lion.roar(); //Behaviour specific to Sub-class
            //Lion roars , not all animals roar

        //So, We use this Sub-class specific instantiation to access
        //Sub-class specific methods which the Base-class lacks
    }
}

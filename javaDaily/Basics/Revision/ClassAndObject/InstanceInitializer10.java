public class InstanceInitializer10 {
    private static int num = 12;
    String word;
    static int instanceBlockCount;
    static int constructorCount;

    {
        System.out.println("Inside instance initializer...");
        System.out.println("num : "+num); //This block is used along or instead with instance variables or constructor o provide

        System.out.println("word : "+word); //complex initialization logic

        word = "Instance variable";
        System.out.println("Called for : "+(++instanceBlockCount));
    }

    InstanceInitializer10() {
        System.out.println("Default...");
        System.out.println("Called for : "+(++constructorCount));
    }

    public static void main(String[] args) {
        new InstanceInitializer10(); //First , instance initializer block is called and then constructor is called during every object initialization

        System.out.println();
        System.out.println();

        new InstanceInitializer10(); //instance initializer block is called first everytime and then constructor is called during object initialization
    }
}

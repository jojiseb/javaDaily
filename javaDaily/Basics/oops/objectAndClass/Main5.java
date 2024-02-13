package objectAndClass;

class Fruit {
    String name;
    String color;
    int numberOfSeeds;

    //Constructor Overloading -- Overloaded constructor is called based on parameters specified

    //Used for solving different ways to initialise objects

    //no params - 1st Constructor
    //3 parameters - 2nd one
    Fruit() {   //Fruit fruit = new Fruit(); executes the default constructor
        this.name = "Coconut";
        this.color = "green";   //values are assigned manually inside constructpr
        this.numberOfSeeds = 1;
    }

    //Fruit fruit1 = new Fruit("Red", 4, "Apple"); executes the parameterised constructors
    Fruit(String color, int seedNumber, String name) { //values assigned based on parameters
        this.color = color;
        numberOfSeeds = seedNumber;
        this.name = name;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        System.out.println("Name : "+fruit.name+", Color : "+fruit.color+", SeedNo : "+ fruit.numberOfSeeds);

        Fruit fruit1 = new Fruit("Red", 4, "Apple");
        System.out.println("Name : "+fruit1.name+", Color : "+fruit1.color+", SeedNo : "+ fruit1.numberOfSeeds);

    }
}

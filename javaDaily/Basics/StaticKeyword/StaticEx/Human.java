package StaticEx;

public class Human {
    int age;
    String name;
    boolean isMarried;
    long salary;

    //Using as an instance variable to show example of need of static variable
    long population; //Eg property which can be thought of as common to all objects,but not directly related to objects

    //population is a fact , It can't just like 7 billion for me and 10 billion for him.

    public Human(int age, String name, long salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        this.salary = salary;
        this.population += 1;
    }
}

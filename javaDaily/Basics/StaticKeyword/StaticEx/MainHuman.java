package StaticEx;

public class MainHuman {
    int age;
    String name;
    int salary;
    boolean isMarried;

    static int population;

    MainHuman(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        MainHuman.population += 1; //this.population will also work, but ClassName.staticVariable
    }                           //is the convention

    public void humanDetails() {
        System.out.println("Age : "+this.age+", Name : "+this.name+", " +
                "Salary : "+this.salary+", Marriage Status : "+this.isMarried+", Population : "+MainHuman.population);
    }
}

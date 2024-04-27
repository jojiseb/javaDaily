package StaticEx;

public class Main {
    public static void main(String[] args) {
        Human one = new Human(10, "Sarup", 5000000, false);
        Human two = new Human(20, "Alex", 270000,  true);

        System.out.println(one.name);
        System.out.println(two.isMarried);

        System.out.println(one.population); //1
        System.out.println(two.population); //1  Displays 1 in both cases, when it actually should be 2.
        //After all each human added is increase in population. But here, its acting dependent to each object.

        MainHuman mainHuman = new MainHuman(11, "Jota", 7000000, true);
        System.out.println(MainHuman.population);
        MainHuman notSoMain = new MainHuman(34, "Arsh", 4000000, false);
        System.out.println(MainHuman.population);
        MainHuman third = new MainHuman(33, "Theo", 600000, false);
        System.out.println(MainHuman.population);

        mainHuman.humanDetails();
        notSoMain.humanDetails();

        System.out.println(mainHuman.population); //static member accessed via instance reference
        //This is what actually happens, the static pty is checked for value inside object, only to find
        //there is no value...finally, refers to population pty value in class

        //Or instance ref.Var.ptyName gets replaced by ClassName.ptyName during invocation

        //So, Better to use ClassName.ptyName which is the best practice

        System.out.println(MainHuman.population); //3 Based on each Object created, static variable population gets incremented by 1

        System.out.println(mainHuman.population); //3
        System.out.println(notSoMain.population); //3
        System.out.println(third.population);     //3 --> for all cases it checks for population variable in object, Since not found checks Class
        //Then prints value of property in Object

        //These will work..but don't use it. Convention is to use ClassName

        //ClassName.staticVariable
    }
}

package StaticEx;

public class StaticCheck {
    static int id;
    String name;
    static String race = "Human";

    StaticCheck(String name) {
//        StaticCheck.id = id ++; //every object creation, id will be 0, cuz its post increment
        //where initialization is done and then increment

        // id = 0 --> 1st object    id incremented to 1 but, not assigned, So assign - again
        // for next Object
        //Therefore, id = 0 --> 2nd Object
        this.name = name;
        StaticCheck.id = ++id;
    }
}

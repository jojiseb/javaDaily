package StaticEx;

public class StaticDefault1 {
    static int number;
    static String name;
    static boolean isStatic;

    int instanceNum;
    boolean isInstanceVar;
    String str;
    public static void main(String[] args) { //Outputs -->
        System.out.println("Number : "+StaticDefault1.number); //0
        System.out.println("Name : "+StaticDefault1.name);  //null
        System.out.println("Static or not : "+StaticDefault1.isStatic); //false

        //Static variables get initialised when a class is loaded. These are shared across all instances of a class.
        // If it's not explicitly initialised, it will be assigned a default value.

        StaticDefault1 sd = new StaticDefault1();

        System.out.println("Num : "+sd.instanceNum); //0
        System.out.println("Instance Variable or not : "+sd.isInstanceVar); //false
        System.out.println("String : "+sd.str); //null

        //Instance variables gets initialised every time an object is initialised/created, unlike static variables which gets initialised
        //when class is loaded. If not explicitly initialised, will be assigned to default value.

        //Each instance variables and its value is unique to that instance.
    }
}

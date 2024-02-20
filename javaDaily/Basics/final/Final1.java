
class Check {
    String name;

    @Override
    public String toString() {
        return "Name - "+this.name;
    }

}
public class Final1 {
    public static void main(String[] args) { // final behaves differently with Wrapper classes
        final Check check = new Check();    //Object is final
        System.out.println(check);
        check.name = "String type";

        System.out.println("Check : \n"+check); // You can initialise the object value , no problems

        check.name = "Sunny";   // You can change instance variables of final objects, no problem !

        System.out.println("Check : \n"+check);

//        check = new Check();  -  You cannot re-assign final object to a new object, for a non-primitive Object
    }
}

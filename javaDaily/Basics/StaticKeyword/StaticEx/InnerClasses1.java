package StaticEx;

public class InnerClasses1 {

    static class NewTest { //Inner class is made static so to access the inner class
        String name;        //object in outer class's main()
        NewTest(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        NewTest nt = new NewTest("First");
        NewTest nt1 = new NewTest("Second");

        System.out.println("First Name : "+nt.name); //First
        System.out.println("Second Name : "+nt1.name);  //Second
    }
}

package StaticEx;

public class InnerClasses2 {
    static class InnerTest { //Now, Inner Class is not dependent on Objects of Outer Class, but on Class itself
        String name;
        InnerTest(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerTest it = new InnerTest("Abhi");   //Static inner class can create its object in main()
        InnerTest it1 = new InnerTest("Sunny"); //A static inner class is a static member of outer class. It simply means Inner class can instantiate its
        //its object without an instance of outer class.

        System.out.println("1st Name : "+it.name); //Abhi
        System.out.println("2nd Name : "+it1.name); //Sunny
    }
}

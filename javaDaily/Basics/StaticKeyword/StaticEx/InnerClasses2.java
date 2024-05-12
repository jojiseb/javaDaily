package StaticEx;

public class InnerClasses2 {
    static class InnerTest { //Now, Inner Class is not dependent on Objects of Outer Class, but on Class itself
        String name;I
        InnerTest(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerTest it = new InnerTest("Abhi");   //Static inner class can create its object in main()
        InnerTest it1 = new InnerTest("Sunny");

        System.out.println("1st Name : "+it.name); //Sunny
        System.out.println("2nd Name : "+it1.name); //Sunny
    }
}

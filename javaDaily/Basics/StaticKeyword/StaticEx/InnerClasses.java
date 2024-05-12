package StaticEx;

public class InnerClasses { //Outer Classes can't be static, because it is not dependent on any other class
    class Test {    //is Inner class, so it can be static / non-static
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

//        Test t1 = new Test("One");  Non-static class's Object can't be referenced from a static context
//        Test t2 = new Test("Two");  Here, Test class is an inner-class which is itself dependent on outer class

        // So, Either make the inner class Test static or use outer class object to access inner class object

        //using outer class object -->
        InnerClasses innerClasses = new InnerClasses();

        Test t1 = innerClasses.new Test("One");
        Test t2 = innerClasses.new Test("Two");


    }
}

//static class A { Throws error since outer class can't be static, cuz not
//                  dependent on any other class
//}

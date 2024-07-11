package AnonymousClasses;

class DemoAnon {
    int y = 45;
    void test() {
        System.out.println("Super Test");
    }
    void view() {
        System.out.println("Demo view");
    }
}

class SubDemo {
    static int i = 90;
    static String j = "CPU";
    int a = 12;
    String k = "JAVA";
    void aMethod() {
        DemoAnon d = new DemoAnon() { //Anonymous class inside a method
            @Override
            public void view() {
                System.out.println("Anon Class view");
                System.out.println("i : "+i+", j : "+j+", a : "+a+", k : "+k);

                System.out.println("y : "+y);
                        //All Fields and methods of Super Class is accessible inside anonymous
                        //because anonymous class is a subclass of DemoAnon

                //Anonymous Class is extending a class here, so all fields and methods are inherited
                test();

                subTest(); //Invoking inside anonymous class itself, else hard to access
            }
            void subTest() {
                System.out.println("Sub test...");
                super.test();
            }
        };

        d.view();
        //d.subTest(); Won't work since DemoAnon won't have these members
    }
}

public class AnonymousLearn2 {
    public static void main(String[] args) {
        SubDemo subDemo = new SubDemo();
        subDemo.aMethod();
    }
}

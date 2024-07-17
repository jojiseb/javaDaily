package AnonymousClasses;

public class AnonymousClassExample1 {
    interface HelloWorld {
        void greet();
    }
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld() {
            String name = "World"; //Field initialisation
            @Override
            public void greet() {
                name = "everyone"; //stmt inside a method
                System.out.println("Hello, "+name);

                System.out.println("calling xtra method...");
                xtra();
            }

            public void xtra() {
                System.out.println("test extra method");
            }

//            System.out.println("Hello"); Stand-alone stmts aren't allowed here
        };

        hw.greet();

    }
}

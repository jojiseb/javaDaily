package AnonymousClasses;

public class HelloWorldAnonymousClasses {
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world"; //For default greeting in greet()
            @Override
            public void greet() {
                greetSomeone(name);
            }
            @Override
            public void greetSomeone(String someone) { //Greeting with a specific
                name = someone;                         //name
                System.out.println("Hello "+name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone(name);
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut "+name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            @Override
            public void greet() {
                greetSomeone(name);
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, "+name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Jerry");
        spanishGreeting.greetSomeone("Koby");
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses ha = new HelloWorldAnonymousClasses();
        ha.sayHello();
    }
}

//Anonymous class contains new operator, name of interface to implement/class to extend.
//Also, Parenthesis that contain arguments to a constructor (Here, its empty since we implement interface)

//You can also see no stand-alone stmts are allowed inside anonymous classes like print statements
//Its like trying to provide outside method in a class body. Only methods and field initialisations allowed


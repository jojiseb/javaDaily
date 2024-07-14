package AnonymousClasses;

interface Greeting {
    String greet(String name);
}

public class AnonymousLearn12 {
    public static void main(String[] args) {
        Greeting a = new Greeting() {
            @Override
            public String greet(String name) {
                return "Hello "+name;
            }
        };

        Greeting b = new Greeting() {
            @Override
            public String greet(String name) {
                return "Hi "+name;
            }
        };

        System.out.println("Saying hello : "+a.greet("Charles"));
        System.out.println("Saying hi : "+b.greet("Rumi"));
    }
}

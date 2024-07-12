package AnonymousClasses;

interface New {
    void newOne();
}

class NewClass {
    void print() {
        New n = new New() {
            @Override
            public void newOne() {
                System.out.println("New Item");
            }
        };

        n.newOne();
    }
}

public class AnonymousLearn9 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.print();
    }
}

package AnonymousClasses;

interface DemoVid {

    int a = 34;
    void interView();
}

class Implement {
    void imp() {
        DemoVid q = new DemoVid() {
            @Override
            public void interView() {
                System.out.println("Implemented view from anonymous class");
                t();
            }
            void t() { //a is accessible since anonymous class is implementing
                System.out.println(" a : "+a); //an interface
            }
        };

        q.interView();
    }
}

public class AnonymousLearn3 {
    public static void main(String[] args) {
        Implement q = new Implement();
        q.imp();
    }
}

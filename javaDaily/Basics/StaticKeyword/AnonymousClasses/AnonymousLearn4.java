package AnonymousClasses;

class One {
    void oneTest() {
        System.out.println("Hello");
    }
}
class SubOne {
    One o = new One() {
        @Override
        public void oneTest() {
            System.out.println("Sub-Test..");
            a();
        }

        void a() {
            System.out.println("Check");

            System.out.println();
        }
    };

    void outside() {
        o.oneTest();
    }
}

public class AnonymousLearn4 {
    public static void main(String[] args) {
        SubOne s = new SubOne();
//        s.o.oneTest();
        s.outside();
    }
}

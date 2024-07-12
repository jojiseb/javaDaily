package AnonymousClasses;

class A1 {
    void aMethod() {
        System.out.println("Super method");
    }
}
class SubA {
    void subMethod() {
        A1 a1 = new A1() {
          @Override
          public void aMethod() {
              System.out.println("Sub Method");
          }
        };

        a1.aMethod();
    }
}

public class AnonymousLearn7 {
    public static void main(String[] args) {
        SubA su = new SubA();
        su.subMethod();
    }
}

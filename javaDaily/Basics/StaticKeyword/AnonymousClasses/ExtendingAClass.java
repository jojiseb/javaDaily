package AnonymousClasses;

class Demo {
    public void view() {
        System.out.println("Demo view");
    }
}

class MyClass {
    public void myClass() { //Anonymous class inside a method
        //Anonymous class is extending a class Demo
        Demo demo = new Demo() { //Basically subclassing without extends keyword
          @Override
          public void view() { //override view() of super-class
              System.out.println("Anonymous view");
          }
        };
        demo.view();
    }
}

public class ExtendingAClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myClass();
    }
}

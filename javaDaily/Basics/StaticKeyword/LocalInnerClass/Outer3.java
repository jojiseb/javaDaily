package LocalInnerClass;

class Test1 {
    int s = 10;
    void meth1() {
        System.out.println("Instance method..");
    }
    static String a = "text";
    static void disp() {
        System.out.println("Static method...");
    }

    //Local Inner Class
    void localInner() {

        int y = 78;

//      y = 9; --> won't work since local variables used in local inner
//      class must be final or effectively final

        class LocalInner { //Can't provide access modifiers to class inside a method

            void access() {
                disp();
                meth1();
                System.out.println("a : "+a+", s : "+s+", y : "+y);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.access();
    }
}

public class Outer3 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.localInner();
    }
}

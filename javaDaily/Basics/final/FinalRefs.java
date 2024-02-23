
class X {
    int xNo;
}
public class FinalRefs {
    public static void main(String[] args) {
        final X x = new X();
        System.out.println("No : "+x.xNo);

        x.xNo = 20;
        System.out.println("No : "+x.xNo);

        x.xNo = 30;
        System.out.println("No : "+x.xNo);

        //final reference doesn't mean Object it refers to is immutable
        // Can change the properties of X instance
        //It means it can't be re-assign to a new Object

//        x = new X(); --> Can't re-assign final reference variable.
    }
}

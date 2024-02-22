
class A1 {
    public final void sound() { //final method -- can't be over-ridden in subclass
        System.out.println("First Sound");
    }
}

class AA1 extends A1 {  //final method can be used if you want to prevent any further modification in hierarchy
//    @Override         Won't work as you can't override a final method
//    public void sound() {         in a sub-class
//        System.out.println("Second Sound");
//    }
}

public class Final4 {
    public static void main(String[] args) {
        AA1 aa1 = new AA1();
        aa1.sound();
    }
}

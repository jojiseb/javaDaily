
//class B {
//    public void makeSound() {
//        System.out.println("Parent Sound B !!!");
//    }
//}

//class BB extends B {
//    @Override
//    public void makeSound() {
//        System.out.println("Sound BBB !!");
//    }
//}

final class B {
    public void makeSound() {
        System.out.println("B makes Sound");
    }
}

/*class BB extends B {  This won't work as you can't inherit a final class
    @Override
    public void makeSound() {
        super.makeSound();
    }
}
*/

public class Final3 {
    public static void main(String[] args) {
//        BB bb = new BB();
//        bb.makeSound();   In normal case, Since BB inherits from B, makeSound() of
// Sub-Class BB is invoked, since makeSound() is over-ridden on sub-class
    }
}

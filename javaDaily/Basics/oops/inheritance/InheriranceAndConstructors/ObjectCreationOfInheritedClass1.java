package inheritance.InheriranceAndConstructors;

class Dog {
    Dog() {
        System.out.println("Super class");
        System.out.println("HashCode of super : "+this.hashCode());
        System.out.println("Class Name of super : "+this.getClass().getSimpleName());
    }
}
class Pug extends Dog {
    Pug() {
        System.out.println("Sub class 1 ");
        System.out.println("HashCode of sub 1 : "+this.hashCode());
        System.out.println("Class name of sub 1 : "+this.getClass().getSimpleName());
    }
}

class Lab extends Dog {
    Lab() {
        System.out.println("Sub class 2 ");
        System.out.println("HashCode of sub 2 : "+this.hashCode());
        System.out.println("Class name of sub 2 : "+this.getClass().getSimpleName());
    }
}

public class ObjectCreationOfInheritedClass1 {
    public static void main(String[] args) {
        Pug pug = new Pug();
        System.out.println("\n");
        Lab lab = new Lab();

    }
}

package inheritance.InheriranceAndConstructors;

class Pen {
    Pen() {
        System.out.println("Super class ");
        System.out.println("HashCode of super : "+this.hashCode());
        System.out.println("Class name of super : "+this.getClass().getSimpleName());
    }
}

class Lexi extends Pen {
    Lexi() {
        System.out.println("Sub class 1 ");
        System.out.println("HashCode of sub 1 : "+this.hashCode());
        System.out.println("Class name of sub 1 : "+this.getClass().getSimpleName());
    }
}

class ChottaLexi extends Lexi {
    ChottaLexi() {
        System.out.println("Sub class 2 ");
        System.out.println("HashCode of sub 2 : "+this.hashCode());
        System.out.println("Class name of sub 2 : "+this.getClass().getSimpleName());
    }
}
public class ObjectCreationOfInheritedClass2 {
    public static void main(String[] args) {
        ChottaLexi chottaLexi = new ChottaLexi();
    }
}

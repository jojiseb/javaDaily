package inheritance.InheriranceAndConstructors;

class Fruit {
    Fruit() {
        System.out.println("Super class constructor...");

        System.out.println("HashCode of Super : "+this.hashCode());

        System.out.println("Class Name : "+this.getClass().getSimpleName());
    }
}

class Apple extends Fruit {
    Apple() {
        System.out.println("Sub Class constructor..");

        System.out.println("HashCode of sub : "+this.hashCode());

        System.out.println("Class name : "+this.getClass().getSimpleName());
    }
}
public class ObjectCreationOfInheritedClass {
    public static void main(String[] args) {
        Apple apple = new Apple();
    }
}

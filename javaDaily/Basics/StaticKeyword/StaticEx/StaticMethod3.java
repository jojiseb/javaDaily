package StaticEx;

class Animal {
    static void eat() { //static method
        System.out.println("Animal is eating");
    }

    void hello() {  //instance method
        System.out.println("Hello from animal");
    }
}

class  Dog extends Animal {
    static void eat() { //static method
        System.out.println("Dog is eating");
    }

    void hello() {  //instance method
        System.out.println("Hello from Dog");
    }
}

public class StaticMethod3 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat(); //eat() of Animal gets executed, based on ref.Type at compile time

        a.hello(); //hello() of object type, resolved during run-time

        Dog d = new Dog();
        d.eat(); //eat() of Dog gets executed, based on object's type
                //the reference points to
        d.hello(); //hello() from Dog, resolved during compile time

        new Animal().hello(); //hello() from Animal, since Animal is the object
    }
}

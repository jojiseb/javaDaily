
abstract class Animal {
    abstract void makeSound();
}
public class Example {
    public static void main(String[] args) {
        Animal animal = new Animal() { //here, Its seen that the anonymous class is derived from
            private int age;        //Animal class. So, it must implement its methods
            private String name;
            public String name() {
                return name;
            }
            public int getAge() {
                return age;
            }
            @Override
            void makeSound() {
                System.out.println("Grrrr...from "+name+" whose age is "+age);
            }
        };

        //The fields age, name aren't initialized. Need to use a instance initializer

        animal.makeSound();
    }
}

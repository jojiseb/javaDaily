
abstract class Student { //Abstract Class
    abstract void workHard();
}
public class WIthInstanceInitializer {
    public static void main(String[] args) {
        Student student = new Student() { //Anonymous Class
            private int roll;
            private String name;

            {
                roll = 1;   //Values will be assigned since we use instance initializers
                name = "Abhi";
            }

            @Override
            void workHard() {
                System.out.println("Hustle hard No. "+roll+", Mr. "+name);
            }
        };

        student.workHard();
    }
}

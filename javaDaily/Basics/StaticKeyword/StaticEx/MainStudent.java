package StaticEx;

public class MainStudent {

    public static void main(String[] args) {
//        Student student = new Student(1, "Naman", "Physics");
//        Student student1 = new Student(2, "Manu", "Maths");

        System.out.println(Student.getCategory()); //You can access static variables without using Objects
        // Shows these are not bound on objects, but Classes instead

    }

}

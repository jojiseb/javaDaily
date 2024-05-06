package StaticEx;

public class Student {
    private int id;
    private String name;

    private String favouriteSubject;

    private static String category = "Student";

    public static String getCategory() {
        return Student.category;
    }

    Student(int id, String name, String favouriteSubject) {
        this.id = id;
        this.name = name;
        this.favouriteSubject = favouriteSubject;
    }
}

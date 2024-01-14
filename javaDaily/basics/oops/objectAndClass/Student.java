package objectAndClass;

public class Student {
    private int id;
    private String name;

    Student(String n) {
        this.name = n;
        System.out.println("\n"+this.getClass().getName());
    }

    private void setId(int identity) {
        this.id = identity;
    }
    public int getId() {
        return id;
    }
    private void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void studentDetails() {
        System.out.println("Id : "+id+", Name : "+getName());
    }

    public static void main(String[] args) {
        Student student = new Student("Arun");
        student.studentDetails();
        student.setId(21);
        student.studentDetails();
        System.out.println();
    }
}

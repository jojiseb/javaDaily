package objectAndClass;

interface Subject {
    String getSubjectName();
    int getSubjectId();

//    String subjectName = null; // Fields in interface are by default
//    int subjectId = 0; //public static final

    default void subjectDetails(Subject subject) { //So, They can't be re-initialized by instances
        System.out.println(subject.getSubjectName()+" Details are : ");
        System.out.println("Id : "+subject.getSubjectId()+", Name : "+subject.getSubjectName());
    }
    static void method(Subject subject) { //static methods can't be over-riden by sub-classes
        System.out.println("Teach "+subject.getSubjectName());
    }
}

class Maths implements Subject {
    int id;
    String name;
    Maths(int subjectId, String subjectName) {
        this.id = subjectId;
        this.name = subjectName;
    }
    @Override
    public int getSubjectId() {
        return id;
    }
    @Override
    public String getSubjectName() {
        return name;
    }

    @Override
    public void subjectDetails(Subject maths) { //Even the parameter should be of same type
        System.out.println("Maths override"); //You can't even use a sub-class instead
    }
}

class Physics implements Subject {
    int id;
    String name;

    public Physics(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getSubjectName() {
        return name;
    }
    @Override
    public int getSubjectId() {
        return id;
    }

}

public class SubjectTest {
    public static void main(String[] args) {
        Subject subject = new Maths(1, "Geometry");

        subject.subjectDetails(subject);

        Subject.method(subject);

        Subject subject1 = new Physics(2, "Quantum Mechanics");
        subject1.subjectDetails(subject1);

        Subject.method(subject1);
    }
}

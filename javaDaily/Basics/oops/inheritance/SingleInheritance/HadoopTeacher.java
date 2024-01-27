package inheritance.SingleInheritance;

class Teacher {
    String designation = "Teacher";
    String collegeName = "Youtube";

    void does() {
        System.out.println("Teaching");
    }
}
public class HadoopTeacher extends Teacher {
    String subject = "Hadoop";
    public static void main(String[] args) {
        HadoopTeacher hadoopTeacher = new HadoopTeacher();
        hadoopTeacher.does();
        System.out.println(hadoopTeacher.subject);
        System.out.println("by ");
        System.out.println("Designation : "+hadoopTeacher.designation);
        System.out.println("College : "+hadoopTeacher.collegeName);

    }
}

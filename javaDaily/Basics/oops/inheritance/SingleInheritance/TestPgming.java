package inheritance.SingleInheritance;

class ProgrammingLanguages {
    String syntax() {
        return "Syntax is strict";
    }
}
class Java extends ProgrammingLanguages {
    void oops() {
        System.out.println("OOPS Concepts !");
    }
}

public class TestPgming {
    public static void main(String[] args) {
        Java java = new Java();
        System.out.println("For Every Programming language, "+java.syntax()+" is really important !");
        System.out.println("And Java never differs from that !");
        System.out.println("Unique about java is its : ");
        java.oops();
    }
}

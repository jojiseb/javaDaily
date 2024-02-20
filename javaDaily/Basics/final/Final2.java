
class A {
    int classId;
    String standard;
    A(int classId, String std) {
        this.classId = classId;
        this.standard = std;
    }
}

public class Final2 {
    public static void main(String[] args) {
//        A a = new A(1, "I");
//        System.out.println("Id : "+a.classId+", Std : "+a.standard);

//        a = new A(2, "II");  //Perfectly valid normal case

//        System.out.println("Id : "+a.classId+", Std : "+a.standard);


        //But if the object is final..

        final A a = new A(10,"X");
        System.out.println("Id : "+a.classId+", Std : "+a.standard);

       /* a = new A(11, "XI"); */ // Can't re-initialise a final object

        //But you can re-initialise instance variables with no restrictions

        a.classId = 5;
        a.standard = "V";

        System.out.println("Id : "+a.classId+", Std : "+a.standard);
    }
}

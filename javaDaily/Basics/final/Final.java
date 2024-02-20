public class Final {

    int rno;
//    rno = 34; You can't assign value outside method in class body like this

    //Either assign while declaring itself or add a constructor to initialise

//    final float marks;    // You need to initialise while declaring itself if using a final keyword for primitive types
    final long telephone = 9674784757L; // You either initialise like this
                                        // OR
                                        // Add a constructor for the variable initialising
    final String name;
    Final(String name) {        // Using constructor for initialising
        this.name = name;
    }

    void finalOutput() {
        System.out.println("Rno : "+rno+", Phone : "+telephone+", Name : "+this.name);
    }

    public static void main(String[] args) {
        Final fin = new Final("Ruhi");
        System.out.println("Rno : "+fin.rno+", Phone : "+fin.telephone+", Name : "+fin.name);

        fin.finalOutput();

        fin.rno = 12;
//        fin.name = "Mohan"; - Can't assign to final variable

       // fin.telephone = 90658989586L; - Can't assign to final variable

    }
}

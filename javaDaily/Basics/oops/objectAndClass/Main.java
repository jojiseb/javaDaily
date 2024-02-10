package objectAndClass;

public class Main {
    public static void main(String[] args) {

        //data type to store 5 rollNos
        int[] rollNo = new int[5];

        //data type to store 5 student names
        String[] names = new String[5];

        //Data Structure to store/represent rollNo, marks & names
        //of 5 students
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        // The above case is wrong, we have used 3 different data structures for
        // holding each data, not single data structure..here, we need Class

        StudentNew[] students = new StudentNew[5];

        StudentNew arun;
    }
}
    //This is the right way to represent rollNo, marks & names, using a class
class StudentNew { //Class, a template, is a named group of properties and functions
    int[] rollNo = new int[5];  //3 properties
    String[] name = new String[5];  //We can also add functions if necessary
    float[] marks = new float[5];
}

//Class is a logical construct, Object is a physical reality,
//Object is what actually occupies space in memory
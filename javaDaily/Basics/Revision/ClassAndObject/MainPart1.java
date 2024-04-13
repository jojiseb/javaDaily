public class MainPart1 {
    public static void main(String[] args) {
        //Datatype to store 5 roll numbers
        int[] rollNo = new int[4];

        //Datatype to store 5 student names
        String[] names = new String[4];


        //DataStructure to store rollNo, names and marks of 5 students

        StudentDS[] studentDS = new StudentDS[4];
    }
}

class StudentDS {
    int[] rollNo = new int[4];
    String[] names = new String[4];
    int[] marks = new int[4];
}

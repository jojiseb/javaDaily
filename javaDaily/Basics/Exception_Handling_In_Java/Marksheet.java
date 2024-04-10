import java.util.Scanner;

public class Marksheet {
    private int marks;

    public int getMarks() {
        return marks;
    }

    private void setMarks(int marks) {
        if(marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be btw 0 and 100 !! ");
        }
        else {
            this.marks = marks;
            System.out.println("Marks Entered is : "+this.marks);
        }
    }

    public static void main(String[] args) {
        Marksheet marksheet = new Marksheet();
        System.out.println("Please enter your marks : ");
        Scanner obj = new Scanner(System.in);
        int marks = obj.nextInt();

        marksheet.setMarks(marks);
    }
}

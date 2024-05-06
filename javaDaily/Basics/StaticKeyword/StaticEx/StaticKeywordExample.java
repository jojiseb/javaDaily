package StaticEx;

public class StaticKeywordExample {
    private static int count = 0;   //Just to show the number of objects which are used to access static methods/variables

    //Static variable

    public static void printCount() {
        System.out.println("Example objects created till now : "+StaticKeywordExample.count);
    }
    //Static method

    public static void main(String[] args) {
        StaticKeywordExample.printCount();
    }
}

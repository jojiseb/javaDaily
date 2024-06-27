package InnerClasses;

public class Outer {

    private String outerField = "Outer Field";
    static int area;

    class Inner {
        void display() {//Since, Inner class instances hold a reference to outer class instances,
            System.out.println("Outer : "+outerField+" , Area : "+area); // it allows member inner classes
        }       //to access instance methods, variables including private ones
    }
    public static void main(String[] args) {
        Outer outer = new Outer(); //Creating outer class instance first to access inner class instance
        Inner inner = outer.new Inner(); //Creating instance of inner class --> Inner class
        //instance has reference to outer class instance
        inner.display();
    }
}

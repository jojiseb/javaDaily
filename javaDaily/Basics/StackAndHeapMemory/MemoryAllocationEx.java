public class MemoryAllocationEx {
    //static variable is a class Variable that resides in Heap Memory
    private static int classVariable = 60;

    public static void main(String[] args) {
        //Local variables in Stack Memory
        int firstStackVar = 12;
        String secondStackVar = "Hello World";

        //Creating an object in Heap Memory
        StackAndHeap stackAndHeap = new StackAndHeap("Manu", "Last");

        System.out.println("Stack variables : "+firstStackVar+", "+secondStackVar);
        System.out.println("Class Variables (Heap) : "+classVariable);

        stackAndHeap.classDetails();
    }
}

class StackAndHeap {

    //Instance variables are stored in Heap Memory
    String name;
    String description;

    //Constructor for initialising instance variables
    StackAndHeap(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void classDetails() {
        System.out.println("Class Details\n Name : "+this.name+", Description : "+this.description);
    }
}

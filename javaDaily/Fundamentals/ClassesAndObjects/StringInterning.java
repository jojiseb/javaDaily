public class StringInterning {
    public static void main(String[] args) {
        String a = "one"; //This is a String literal, Value of a is checked to see if its content already
                        //exists in String pool. if not, it is stored in String pool.
                    //So, It gets interned automatically by the JVM

        //So, String interning is about storing only one copy of each distinct String  value in String pool,
        //which leads to other references created to same value to share the instance, instead of creating new location in memory

        //Improves m/y efficiency

        //We can also manually perform interning to store identical values in String pool and share same m/y
        //with other strings that have same value

        //String.intern() --> performs manual interning

        //Only use interning if there are many duplicate values

        String b = "one";
        //the interned String is returned and shared by b here

        if(a == b) { //Same reference since they refer same m/y location
            System.out.println("Same reference");
        }
        else {
            System.out.println("Different reference");
        }

        System.out.println("Compared with a String object in heap..");
        String c = new String("one");

        if(a == c) { //new keyword creates new object every time even though its same content
            System.out.println("Same reference"); //So, its obvious that reference is different
        }
        else {
            System.out.println("Different reference");
        }

        //Now, to make the object with new keyword to refer to String pool content, to increase m/y efficiency,
        //We try manual interning the String

        System.out.println("\nAfter manual interning..");
        String interned = c.intern(); //String pool is checked first for already interned or existing content.
                                //If not found, go with manual interning

        if(a == interned) {
            System.out.println("Same reference");
        }
        else {
            System.out.println("Different reference");
        }

        System.out.println();
        System.out.println("Trying to intern an object that doesn't exist in String pool ..");
        String d = new String("Two test");

        String internTest = d.intern();

        String e = "Two test"; //Now, explicitly interned string already exist in String pool, So e also refer to same reference in m/y
                                //instead of creating new memory
        if(internTest == e) {
            System.out.println("Same reference");
        }
        else {
            System.out.println("Different reference");
        }

        //After interning, its faster and better to compare Strings using == instead of equals()
        //Because, == compares by m/y address , equals() compares by content, taking each character
    }
}

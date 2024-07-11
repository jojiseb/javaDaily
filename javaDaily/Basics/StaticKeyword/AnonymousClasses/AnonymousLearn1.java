package AnonymousClasses;

interface AnonImpl {
    void trySomething();
}

public class AnonymousLearn1 {
    public static void main(String[] args) {
        AnonImpl a = new AnonImpl() { //Anonymous Class is implementing an interface
            public void trySomething() {//Custom method implementation
                System.out.println("Trying inside Anon..");
            }
        }; //Java compiler generates an internal class for anonymous inner class
        //which is a subtype of interface or super class that the anonymous inner class
        //implements or extends


        a.trySomething();
    }
}

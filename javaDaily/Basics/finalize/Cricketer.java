class CricketerDemo { //finalize() - for garbage collecting/destroying unreferenced/unused objects
    // in java

    /* Ways to make objects unused -
    --> Nulling the reference
            Eg : Cricketer c = new Cricketer();
                    c = null; --> c is eligible for garbage collection
    --> By assigning a reference to another object
            Eg: Cricketer c = new Cricketer();
                Cricketer c1 = new Cricketer();
                c = c1 // Here, c1 reference is assigned to c, now c object is eligible
                        for garbage collected
    --> By Anonymous Object
            Eg: new Cricketer(); --> Anonymous object, no reference to this object
                So, eligible tp be garbage collected
     */

    public CricketerDemo() {
        System.out.println(this.hashCode()+" gets created of "+this.getClass().getSimpleName());
    }

    protected void finalize() { //To execute just before garbage collector, for clean up processing
        System.out.println(this.hashCode()+" of "+this.getClass().getSimpleName()+" gets destroyed");
    }   //finalize() is invoked each time before an Object is garbage collected
}

public class Cricketer {
    public static void main(String[] args) {
        System.out.println();
        CricketerDemo cd = new CricketerDemo();
        cd = null; // object cd is de-referenced & made eligible gor gc

        CricketerDemo cd1 = new CricketerDemo();
        CricketerDemo cd2 = new CricketerDemo();
        cd1 = cd2;  // object cd1 gets garbage collected

        new CricketerDemo();    //Gets garbage collected
        System.out.println();
        System.gc();

        // finalize() output won't be displayed since garbage collection is automatic process
        //If you need to force JVM to perform garbage collection, it needs to use System.gc();

        //So, System.gc() is used to call the finalize() just before the object is destroyed
    }
}

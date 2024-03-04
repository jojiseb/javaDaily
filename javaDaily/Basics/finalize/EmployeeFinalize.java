public class EmployeeFinalize {
    protected void finalize() {
        System.out.println("Finalizing...");
    }
    public static void main(String[] args) {
        EmployeeFinalize employeeFinalize = new EmployeeFinalize();
        employeeFinalize = null; //1. De-referencing Object

        EmployeeFinalize employeeFinalize1 = new EmployeeFinalize();
        EmployeeFinalize employeeFinalize2 = new EmployeeFinalize();

        employeeFinalize1 = employeeFinalize2;  //De-referencing by assigning to another Object

        new EmployeeFinalize(); //Anonymous Object, with no reference
        // These 3 cases are made eligible for garbage collection.
        //But JVM decides when to collect..and perform any clean up (finalize() operations)

        //Not called in this case

        //But if I add System.gc() , it perform gc explicitly
        System.gc(); //--> Not a good practice, better let JVM handle gc
        //System.gc() performs gc once for each object
        System.out.println("GC started..");

        //  Now, GC Started and the clean up code in finalize() gets executed
    }
}

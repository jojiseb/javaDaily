package objectAndClass;

class Department {
    int deptId;
    String deptName;

    //We use "this" keyword to access every object, and then use it to initialise values in constructor
    //else you can't assign values with every other object
    // this.instance Variable is same as ref.variable.instance Variable to initialise values
    Department() { // We use constructor to avoid assigning values everytime like ref.variable.instance variable
        this.deptId = 22;
        this.deptName = "IT";
    }

    void greet() {
        System.out.println("Hello, It's from "+deptName); //this.deptName also works
    }

    void changeDept(String deptName) {
        this.deptName = deptName;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Department department = new Department();
        Department department1 = new Department();
        System.out.println("Id : "+department.deptId+", Name: "+department.deptName); // Before adding constructor initialisation,
                                                                        // these display default values

        department.deptId = 12; //Initialising
        department.deptName = "R&D";

        System.out.println("Id : "+department.deptId+", Name: "+department.deptName);
        System.out.println();
        department.greet();
        department1.greet();

        department.changeDept("ISRO");
        System.out.println("\nId : "+department.deptId+", Name: "+department.deptName);

        department1.changeDept("NASA");
        System.out.println("Id : "+department1.deptId+", Name: "+department1.deptName);

    }
}

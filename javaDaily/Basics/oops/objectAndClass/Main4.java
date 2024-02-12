package objectAndClass;

class Department {
    int deptId;
    String deptName;
}

public class Main4 {
    public static void main(String[] args) {
        Department department = new Department();
        Department department1 = new Department();
        System.out.println("Id : "+department.deptId+", Name: "+department.deptName);

        department.deptId = 12; //Initialising
        department.deptName = "R&D";

        System.out.println("Id : "+department.deptId+", Name: "+department.deptName);
    }
}

package StaticEx;

public class Department {
    public static int numberOfWorkers;
    public String name;

    Department(String name) {
        this.name = name;
        Department.numberOfWorkers++; //Even if new workers are created,
                //numberOfWorkers are created and incremented accordingly
    }

    public static void main(String[] args) {
        Department department = new Department("Abhi");

        System.out.println("Workers : "+Department.numberOfWorkers);

        Department department1 = new Department("Anu");

        System.out.println("Workers : "+Department.numberOfWorkers);

        Department department2 = new Department("Sid");
        System.out.println("3rd : "+Department.numberOfWorkers);
    }
}

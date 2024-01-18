package inheritance.SingleInheritance;

class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int benefits = 30000;
}

public class Main1 {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        System.out.println("Employee Job  Profile @ Main1 : Salary : "+engineer.salary+", Benefits: "+engineer.benefits);
    }
}

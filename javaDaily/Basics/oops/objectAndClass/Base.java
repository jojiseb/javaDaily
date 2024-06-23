package objectAndClass;

abstract class SunStar {
    abstract void printInfo();
}

class EmployeeSun extends SunStar {
    void printInfo() {
        String name = "Linus";
        int age = 23;
        float salary = 25000;

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }
}

public class Base {
    public static void main(String[] args) {
        SunStar sunStar = new EmployeeSun();
        sunStar.printInfo();
    }
}

package objectAndClass;

import java.util.Arrays;

class Employee { //instance variables - outside methods, inside class
    int eNo; //3 instance variables / states - variables inside object
    String empName; //We access instance varibles using dot oprtr (.);
    String empDept; // objectReference.propertyName
}

public class Main3 {
    public static void main(String[] args) {
        //Employee employee; //Since, its local it says a non-initialised

        //To see what will be default value for a non-initialised reference variable, see below eg:

        Employee[] employees = new Employee[2]; // Alternative example to show the value of a reference variable --> Array shows that it is capable of holding employee objects
        System.out.println(Arrays.toString(employees)); // Since, An Object isn't yet initialised, null is the default value

        for(Employee employee: employees) {
            System.out.println(employee);   //null
            employee = new Employee();  //getting initialised
            System.out.println(employee);   //Returns String rep. of Object with className and hashCode, denoting that ref.variable is referring to a m/y location
        }
        Employee employee = new Employee(); // LHS happens @ Compile time -- reference variable created
        //RHS happens @ run-time -- allocates m/y @ rum-time

        //You can only access variables via dot operator which are present in class Template, like eNo,empName, empDept

        System.out.println("Emp No : "+employee.eNo);    // 0
        System.out.println("Name : "+employee.empName); // null

        employee.eNo = 23;
        employee.empName = "Sal"; //Initialising values..

        System.out.println("Emp No : "+employee.eNo); //23
        System.out.println("Name : "+employee.empName); //Sal

        System.out.println("Dept : "+employee.empDept); // Product -- default value of instance variable

        //When using instance variables, the value of variables are first checked in object created,whether they exist..
        //If they don't, then use default valued for them i.e., 0 for int, null for String

        //It will print the value present in instance variable over default value if it is available in Object
    }
    // new - allocates m/y @ run-time (dynamic m/y allocation) & returns a reference to it
}

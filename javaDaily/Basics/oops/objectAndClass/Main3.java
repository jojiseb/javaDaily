package objectAndClass;

import java.util.Arrays;

class Employee { //instance variables - outside methods, inside class
    int eNo; //3 instance variables / states - variables inside object
    String empName; //We access instance varibles using dot oprtr (.);
    String empDept = "Product"; // objectReference.propertyName
}

public class Main3 {
    public static void main(String[] args) {
        //Employee employee; //Since, its local it says a non-initialised,for that below eg..
        Employee[] employees = new Employee[2]; // Alternative example to show the value of a reference variable
        System.out.println(Arrays.toString(employees)); // which is not initialising an object -- null is the default value
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

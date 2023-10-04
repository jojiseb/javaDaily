public class PassingObject {
    public static void main(String[] args) {
        Person person = new Person(5,"Jane");
        System.out.println("Before modify..");
        System.out.println("Name : "+person.getName()+", Roll : "+person.getName());
        modify(person);
        System.out.println("Returning from modify : ");
        System.out.println("Name : "+person.getName()+", Roll No : "+person.getRollNo());
    }
                //Here, Original value of Objects is modified since we are passing by reference, instead of copy
                //So, Change made inside the method is reflected outside.
    public static void modify(Person person) {
        System.out.println("Inside modify..");
        System.out.println("Name : "+person.getName()+", Roll: "+person.getRollNo());
        person.setName("Dan");
        person.setRollNo(7);
        System.out.println("After modify : Name : "+person.getName()+", Roll : "+person.getRollNo());
    }
}

class Person {
    private int rollNo;
    private String name;
    Person(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

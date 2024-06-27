package StaticEx;

class StaticCheck1 {
    int id;
    String name;
    static int num;

    StaticCheck1(int id, String name) {
       this.id = id;
       this.name = name;
       num++;
    }
    void details() { //instance method accessing instance variables and static variables
        System.out.println("Id : "+id+", Name : "+name+", Count : "+num);
        stats(); //Instance methods can access static methods
    }

    static void stats() {
        System.out.println("Num : "+num); //Static methods can access static variables and static methods
//        System.out.println(id); Static methods can't access instance methods, instance variables directly
//        details();  //They need some Object reference to do so
    }

    void printInstanceDetails() {
        System.out.println("id : "+id);
        System.out.println("Name : "+name);
        details();  //Instance method accessing instance variables and instance methods directly
    }

}

public class StaticTest {
    public static void main(String[] args) {
        StaticCheck1.stats();
        System.out.println("Num : "+StaticCheck1.num);
        StaticCheck1 sc = new StaticCheck1(1, "One"); //Static method psvm using Object references in order to access
        sc.printInstanceDetails();  //instance variables and instance methods
        sc.details(); //Here, We are using instance of the class that contains non-static method
    }
}

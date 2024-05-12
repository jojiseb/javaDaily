package StaticEx;

public class StaticExecutionOrder {
    static String itemName;
    static int number;

    static { //executes earlier than constructor and once per class load
        System.out.println("Inside static block");
        System.out.println("Name : "+StaticExecutionOrder.itemName+", Number : "+StaticExecutionOrder.number);
        StaticExecutionOrder.itemName = "Chair";
        StaticExecutionOrder.number = 40;
        System.out.println("Name : "+StaticExecutionOrder.itemName+", Number : "+StaticExecutionOrder.number);

    }

    StaticExecutionOrder() { //Executes every time an Object is created
        System.out.println();
        StaticExecutionOrder.itemName = "Bed";
        StaticExecutionOrder.number = 69;
        System.out.println("Constructed");
    }

    public static void main(String[] args) {
        StaticExecutionOrder order = new StaticExecutionOrder();
        System.out.println("Name : "+StaticExecutionOrder.itemName+", Number : "+StaticExecutionOrder.number);

        StaticExecutionOrder order1 = new StaticExecutionOrder();
        System.out.println("Name : "+StaticExecutionOrder.itemName+", Number : "+StaticExecutionOrder.number);

        //Here, We can see Static block is executed earlier, once when the class is loaded
        //Constructor seems to get executed everytime an object is created
    }
}

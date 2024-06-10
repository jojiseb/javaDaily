package SingletonTest.BillPughSingleton;

public class DBConnection1 {
    private DBConnection1() {
        System.out.println("Private..");
    }

    private static class InnerOne { //Using Inner class to create a single instance when class loads
        private static final DBConnection1 instance = new DBConnection1();  //Inner class isn't loaded until it's not referenced
    }

    //for first time. This initial class load is managed by class-loader
    // which automatically handles thread-safety during class initialization

    //So, We don't need synchronized block and volatile. So it's a massive boost in performance and efficiency
    public static DBConnection1 getInstance() {
        return InnerOne.instance;
    }
}

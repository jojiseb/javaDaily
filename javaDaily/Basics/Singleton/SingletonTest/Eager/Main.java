package SingletonTest.Eager;

public class Main {
    public static void main(String[] args) {
//      DBConnection dbConnection = new DBConnection(); Doesn't work as the class has private access

        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection db1 = DBConnection.getInstance();
    }
}

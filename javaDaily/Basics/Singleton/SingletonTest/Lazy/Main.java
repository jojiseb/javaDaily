package SingletonTest.Lazy;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection1 = DBConnection.getInstance();

        System.out.println("HashCode of dbConnection : "+dbConnection.hashCode()+", Identity HashCode : "+System.identityHashCode(dbConnection));
        System.out.println("HashCode of dbConnection1 : "+dbConnection1.hashCode()+", Identity HashCode : "+System.identityHashCode(dbConnection1));

        if(dbConnection.hashCode() == dbConnection1.hashCode()) {
            System.out.println("Same object");
        }
        else {
            System.out.println("Different Objects");
        }
    }
}

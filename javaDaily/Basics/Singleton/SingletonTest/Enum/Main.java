package SingletonTest.Enum;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
            DBConnection dbConnection = DBConnection.INSTANCE;
            System.out.println(dbConnection.hashCode());
        });

        executorService.execute(() -> {
            DBConnection dbConnection = DBConnection.INSTANCE;
            System.out.println(dbConnection.hashCode());
        });

        executorService.execute(() -> {
            DBConnection dbConnection = DBConnection.INSTANCE;
            System.out.println(dbConnection.hashCode());
        });

        executorService.execute(() -> {
            DBConnection dbConnection = DBConnection.INSTANCE;
            System.out.println(dbConnection.hashCode());
        });
    }
}

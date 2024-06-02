package SingletonTest.Eager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) {
//        DBConnection1 dbConnection1 = DBConnection1.getInstance();
//        DBConnection1 dbConnection2 = DBConnection1.getInstance();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> DBConnection1.getInstance());
        executorService.execute(() -> DBConnection1.getInstance());
    }
}

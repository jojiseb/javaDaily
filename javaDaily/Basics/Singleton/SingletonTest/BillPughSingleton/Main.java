package SingletonTest.BillPughSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
        executorService.execute(() -> DBConnection.getInstance());
    }
}

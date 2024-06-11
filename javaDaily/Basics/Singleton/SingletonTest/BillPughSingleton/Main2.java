package SingletonTest.BillPughSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> DBConnection2.getInstance());
        executorService.execute(() -> DBConnection2.getInstance());
        executorService.execute(() -> DBConnection2.getInstance());
        executorService.execute(() -> DBConnection2.getInstance());
        executorService.execute(() -> DBConnection2.getInstance());
    }
}

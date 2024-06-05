package SingletonTest.ThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> DBConnection1.getInstance());
        executorService.execute(() -> DBConnection1.getInstance());
    }
}

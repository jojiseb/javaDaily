package SingletonTest.Lazy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
        executorService.execute(() -> FourthDBConnection.getInstance());
    }
}

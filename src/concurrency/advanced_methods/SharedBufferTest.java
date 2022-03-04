package concurrency.advanced_methods;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Buffer sharedBuffer = new SharedBuffer();

        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        executorService.execute(producer);
        executorService.execute(consumer);

        executorService.shutdown();
    }
}

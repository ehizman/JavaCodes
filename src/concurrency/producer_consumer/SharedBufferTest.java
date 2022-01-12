package concurrency.producer_consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Buffer sharedBuffer = new SynchronizedBuffer();

        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        executorService.execute(producer);
        executorService.execute(consumer);

        executorService.shutdown();
        try {
            boolean isTerminated = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (isTerminated){
                System.out.println("All threads have finished execution");
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

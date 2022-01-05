package chapter20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is the main thread of the application");
        PrintTask taskOne = new PrintTask("taskOne");
        PrintTask taskTwo = new PrintTask("taskTwo");
        PrintTask taskThree = new PrintTask("taskThree");

        System.out.println("Starting executor");
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(taskOne);
        executorService.execute(taskTwo);
        executorService.execute(taskThree);

        executorService.shutdown();
//        boolean isTerminated = executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
//        if (isTerminated){
            System.out.println("The print tasks have finished execution");
//        }
    }
}

package chapter20;

import java.security.SecureRandom;

public class PrintTask implements Runnable{
    private static final SecureRandom generator = new SecureRandom();
    private final String taskName;
    private final int sleepTime;

    public PrintTask(String taskName) {
        this.taskName = taskName;
        this.sleepTime = generator.nextInt(5000);
    }

    @Override
    public void run() {
        System.out.printf("Task- %s is going to sleep for %d milliseconds%n%n",
                taskName, sleepTime);
        try {
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.printf("Task- %s is done sleeping%n%n", taskName);
    }
}

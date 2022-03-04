package concurrency.advanced_methods;


import java.security.SecureRandom;

public class Producer implements Runnable{
    private SecureRandom secureRandom = new SecureRandom();
    private concurrency.advanced_methods.Buffer buffer;

    public Producer(concurrency.advanced_methods.Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(secureRandom.nextInt(3000));
                buffer.blockingPut(i);
                sum += i;
                System.out.printf("Sum is %d%n", sum);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Producer is done producing");
        System.out.println("Terminating producer");
    }
}

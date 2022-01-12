package concurrency.producer_consumer;

import java.security.SecureRandom;

public class Producer implements Runnable{
    private SecureRandom secureRandom = new SecureRandom();
    private UnsychronizedBuffer buffer;

    public Producer(UnsychronizedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(secureRandom.nextInt(3000));
                buffer.setBufferValue(i);
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

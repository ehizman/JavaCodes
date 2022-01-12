package concurrency.producer_consumer;

import java.security.SecureRandom;

public class Consumer implements Runnable{
    private SecureRandom secureRandom = new SecureRandom();
    private UnsychronizedBuffer buffer;

    public Consumer(UnsychronizedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int sum = 0;
        int value = 0;
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(secureRandom.nextInt(3000));
                value = buffer.getBufferValue();
                sum += value;
                System.out.printf("Total sum of values read %d%n", sum);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Consumer read a total of %d values%n", sum);
        System.out.println("Consumer is terminating");
    }
}

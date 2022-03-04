package concurrency.advanced_methods;

import concurrency.producer_consumer.Buffer;

import java.security.SecureRandom;

public class Consumer implements Runnable{
    private SecureRandom secureRandom = new SecureRandom();
    private concurrency.advanced_methods.Buffer buffer;

    public Consumer(concurrency.advanced_methods.Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int sum = 0;
        int value = 0;
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(secureRandom.nextInt(3000));
                value = buffer.blockingGet();
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

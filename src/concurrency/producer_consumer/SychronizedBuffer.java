package concurrency.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;

public class SychronizedBuffer implements Buffer{

        private ArrayBlockingQueue<Integer> arrayBlockingQueue;

        public SychronizedBuffer() {
            this.arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        }

        @Override
        public int getBufferValue() {
            int bufferValue = 0;
            try {
                bufferValue = arrayBlockingQueue.take();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            System.out.printf("Consumer gets value %d%n", bufferValue);
            return bufferValue;
        }

        @Override
        public void setBufferValue(int value) {
            System.out.printf("Producer writes value %d%n", value);
            try {
                arrayBlockingQueue.put(value);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

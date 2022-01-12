package concurrency.producer_consumer;

public class UnsynchronizedBuffer implements Buffer {
    private int bufferValue;

    public UnsynchronizedBuffer() {
        this.bufferValue = 0;
    }

    @Override
    public int getBufferValue() {
        System.out.printf("Consumer gets value %d%n", bufferValue);
        return bufferValue;
    }

    @Override
    public void setBufferValue(int value) {
        System.out.printf("Producer writes value %d%n", value);
        bufferValue = value;
    }
}

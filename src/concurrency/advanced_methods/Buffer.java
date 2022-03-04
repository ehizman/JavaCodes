package concurrency.advanced_methods;

public interface Buffer {
    int blockingGet() throws InterruptedException;
    void blockingPut(int value) throws InterruptedException;
}

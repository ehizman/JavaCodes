package concurrency.advanced_methods;

public class SharedBuffer implements Buffer{
    private int bufferValue = -1;
    private boolean isEmpty = true;
    @Override
    public synchronized int blockingGet() throws InterruptedException {
        while (isEmpty){
            displayMessage("Consumer tries to read");
            displayMessage("Shared Buffer is currently empty");
            wait();
        }
        isEmpty = true;
        displayMessage("Consumer has read the value- " + bufferValue);
        notifyAll();
        return bufferValue;
    }

    private void displayMessage(String message) {
        System.out.printf("%-40s", message);
    }

    @Override
    public synchronized void blockingPut(int value) throws InterruptedException {
        while (!isEmpty){
            displayMessage("Producer tries to write");
            displayMessage("Shared buffer is currently occupied");
            wait();
        }
        isEmpty = false;
        bufferValue = value;
        displayMessage("Producer has put the value- "+ bufferValue);
        notifyAll();
    }
}

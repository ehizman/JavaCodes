package concurrency;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimpleArray {
    private final int[] array;
    private int writeIndex;
    private final SecureRandom secureRandom = new SecureRandom();

    public SimpleArray(int size) {
        this.array = new int[size];
    }

    public void add(int value){
        int position = writeIndex;

        try{
            Thread.sleep(secureRandom.nextInt(5000));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        array[position] = value;
        System.out.printf("---- Wrote %d to position %d%n", value, position);
        writeIndex++;
        System.out.printf("Next write index is %d%n", writeIndex);
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}

class ArrayWriter implements Runnable{
    private SimpleArray simpleArray;
    private int startValue;

    public ArrayWriter(SimpleArray simpleArray, int startValue) {
        this.simpleArray = simpleArray;
        this.startValue = startValue;
    }

    @Override
    public void run() {
        for (int i = startValue; i < startValue+3; i++) {
            simpleArray.add(i);
        }
    }
}

class SimpleArrayTest{
    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray(6);
        ArrayWriter arrayWriter1 = new ArrayWriter(simpleArray, 1);
        ArrayWriter arrayWriter2 = new ArrayWriter(simpleArray, 11);

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(arrayWriter1);
        executorService.execute(arrayWriter2);

        executorService.shutdown();

        try {
            boolean isTerminated = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (isTerminated){
                System.out.println(simpleArray);
            }
            else{
                System.out.println("Timed out while waiting for development");
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

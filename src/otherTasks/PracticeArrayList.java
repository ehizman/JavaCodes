package otherTasks;

public class PracticeArrayList {
    private Integer[] array;
    private int capacity;
    private int length;

    public PracticeArrayList() {
        array = new Integer[10];
    }

    public boolean add(int value){
        if (length == capacity){
            Integer[] tempArray = new Integer[capacity * 2];
            System.arraycopy(array, 0, tempArray, 0, array.length);
            array = tempArray;
            tempArray = null;
            capacity *= 2;
        }
        array[length+1] = value;
        length++;
        return true;
    }

    public boolean remove(int index){
        if (length == 0){
            throw new NullPointerException();
        }
        else{
            if (array.length - index >= 0)
                System.arraycopy(array, index + 1, array, index, array.length - index);
            length--;
        }
        return true;
    }
}

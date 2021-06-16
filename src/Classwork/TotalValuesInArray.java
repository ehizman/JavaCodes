package Classwork;

import commonOperations.IoOperations;

public class TotalValuesInArray {
    public static void main(String[] args) {
        int[] array = new int[]{23,45,56,78,89,76};
        int total = 0;
        for(int number : array){
            total = total + number;
        }
        IoOperations.display(total + "");
    }
}

package chapterTwo;

public class ArithmeticLargestAndSmallest {
    public int sum(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber);
    }

    public int product(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber*secondNumber*thirdNumber);
    }

    public int  average(int firstNumber, int secondNumber, int thirdNumber) {
        return ((firstNumber*secondNumber*thirdNumber)/3);

    }

    public String compare(int firstNumber, int secondNumber, int thirdNumber) {
        int largest = Math.max(firstNumber, secondNumber);
        if ((Math.max(largest, thirdNumber)) != largest){
            largest = thirdNumber;
        }
        int smallest = Math.min(firstNumber, secondNumber);
        if ((Math.min(smallest, thirdNumber)) != smallest){
            smallest = thirdNumber;
        }
        return ("Largest: " + largest + " and Smallest: " + smallest);
    }
}

package Kata;

public class BinaryConverter {
    StringBuilder  binaryDigits = new StringBuilder("");
    public String convertToBinary(int number, int base )
    {
        binaryDigits.append(number % base);
        number = number / base;
        if (number != 0){
            return convertToBinary(number, base);
        }
        return binaryDigits.reverse().toString();
    }

    public static void main(String[] args) {
        BinaryConverter binaryConverter = new BinaryConverter();
        String binaryNumber = binaryConverter.convertToBinary(42, 7);
        System.out.println(binaryNumber);
    }
}

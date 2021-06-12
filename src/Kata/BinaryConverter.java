package Kata;

public class BinaryConverter {
    private static StringBuilder  binaryDigits = new StringBuilder("");
    public static String convertToBinary(int number, int base )
    {
        binaryDigits.append(number % base);
        number = number / base;
        if (number != 0){
            return convertToBinary(number, base);
        }
        return binaryDigits.reverse().toString();
    }

    public static void main(String[] args) {
        String binaryNumber = BinaryConverter.convertToBinary(42, 7);
        System.out.println(binaryNumber);
    }
}

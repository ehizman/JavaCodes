package assignments.Kata;

public class NumberBasesConversion {
        String binaryDigits = "";
        int remainder;
        public String convertToBinary(int number, int base ) {
            remainder = number % base;
            binaryDigits = remainder+binaryDigits;
            number = number / base;
            if (number != 0){
                return convertToBinary(number, base);
            }
            return binaryDigits;
        }

        public static void main(String[] args) {
            NumberBasesConversion binaryConverter = new NumberBasesConversion();
            String binaryNumber = binaryConverter.convertToBinary(13, 2);
            System.out.println(binaryNumber);
        }
    }

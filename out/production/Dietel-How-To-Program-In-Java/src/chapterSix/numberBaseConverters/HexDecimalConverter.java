package chapterSix.numberBaseConverters;

public class HexDecimalConverter {

    public static String hexDecimalConverter(int number) {
        String hexDecimalRepresentationOfNumber = "";
        boolean isNegative = number < 0;
        do {
            switch(number % 16){
                case 10:
                case -10:{
                    hexDecimalRepresentationOfNumber = "A" + hexDecimalRepresentationOfNumber;
                    number = number / 16;
                    break;
                }
                case 11:
                case -11:{
                    hexDecimalRepresentationOfNumber = "B" + hexDecimalRepresentationOfNumber;
                    break;
                }
                case 12:
                case -12:{
                    hexDecimalRepresentationOfNumber = "C" + hexDecimalRepresentationOfNumber;
                    break;
                }
                case 13:
                case -13:{
                    hexDecimalRepresentationOfNumber = "D" + hexDecimalRepresentationOfNumber;
                    break;
                }
                case 14:
                case -14:{
                    hexDecimalRepresentationOfNumber = "E" + hexDecimalRepresentationOfNumber;
                    break;
                }
                case 15:
                case -15:{
                    hexDecimalRepresentationOfNumber = "F" + hexDecimalRepresentationOfNumber;
                    break;
                }
                default:{
                    hexDecimalRepresentationOfNumber = (number % 16) + hexDecimalRepresentationOfNumber;
                }
            }
            number = number / 16;
        }while (number != 0);
        if (isNegative){
            return "#" + "-" + hexDecimalRepresentationOfNumber;
        }
        return "#" + hexDecimalRepresentationOfNumber;
    }
}

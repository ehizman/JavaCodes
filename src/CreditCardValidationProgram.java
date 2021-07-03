public class CreditCardValidationProgram {

    public boolean validPrefix(String creditCardNumber) {
        if (creditCardNumber.charAt(0) == '4' || creditCardNumber.charAt(0) == '5' || (creditCardNumber.charAt(0) == '3' && creditCardNumber.charAt(1) == '7') || creditCardNumber.charAt(0) == '6'){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkLength(String creditCardNumber) {
        if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16){
            return true;
        }
        else {
            return false;
        }
    }

    public int sumOfDoubleEvenPlace(String creditCardNumber) {
        int sum_Of_Evenly_Placed_Digits = 0;
        for (int i =  creditCardNumber.length() - 2; i >= 0; i -= 2) {
            int digitInCreditCardNumberAsInt = Integer.parseInt(String.valueOf(creditCardNumber.charAt(i)));
            int doubleOfCardDigits = digitInCreditCardNumberAsInt * 2;
            if (doubleOfCardDigits > 9){
                sum_Of_Evenly_Placed_Digits += (doubleOfCardDigits / 10) + (doubleOfCardDigits % 10);
            }
            else{
                sum_Of_Evenly_Placed_Digits += doubleOfCardDigits;
            }
        }
        return sum_Of_Evenly_Placed_Digits;
    }
}

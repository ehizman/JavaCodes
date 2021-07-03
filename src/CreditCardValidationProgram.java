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
}

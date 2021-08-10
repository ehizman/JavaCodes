import javax.swing.*;

public class CreditCardValidationApp {
    private static JFrame frame = new JFrame();
    private static CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();

    public static void main(String ... args) {
        String message = """
                Welcome to Credit Card Validation App
                Start Application?
                """;
        int userChoice = showConfirmDialog(message);
        if (userChoice == JOptionPane.YES_OPTION){
            run();
        }
        else{
            if (userChoice == JOptionPane.CANCEL_OPTION){
                System.exit(0);
            }
            main();
        }
    }

    private static void run() throws NullPointerException {
        String message = """
                Welcome to my Credit Card Validation App
                Please enter the credit card number below
                """;
        try{
            String credit_Card_Number = inputDialog(message);
            if(Integer.parseInt(credit_Card_Number) == JOptionPane.CANCEL_OPTION){
                System.exit(0);
            }
            if (!creditCardValidator.validPrefix(credit_Card_Number)){
                throw new Exception("Invalid credit card!");
            }
            else{
                if(!creditCardValidator.isValidLength(credit_Card_Number)){
                    throw new Exception("Incorrect length of digits");
                }
                else{
                    int sum_of_evenly_placed_digits_from_right_to_left =
                            creditCardValidator.sumOfDoubleEvenPlace(credit_Card_Number);
                    int sum_of_oddly_placed_digits_from_right_to_left =
                            creditCardValidator.sumOfOddPlace(credit_Card_Number);
                    if (!creditCardValidator.isValidCreditCard(sum_of_evenly_placed_digits_from_right_to_left,
                            sum_of_oddly_placed_digits_from_right_to_left)){
                        throw new Exception("Invalid card");
                    }
                    else{
                        displayPrompt("Valid card!");
                    }
                }
            }
            message = """
                Press 1 to enter another credit card number
                Press any other key to exit application""";
            String userInput = inputDialog(message);

            if (userInput.equals("1")){
                run();
            }
            else{
                int userChoice = showConfirmDialog("Are you sure you want to exit");
                if (userChoice == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
                else{
                    main();
                }
            }
        }
        catch (Exception error){
            displayPrompt(error.getMessage());
        }
    }

    private static int showConfirmDialog(String message) {
        return JOptionPane.showConfirmDialog(frame,message);
    }

    private static String  inputDialog(String message) {
        return JOptionPane.showInputDialog(frame, message);
    }

    private static void displayPrompt(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
}

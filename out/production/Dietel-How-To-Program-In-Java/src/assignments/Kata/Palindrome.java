package assignments.Kata;

public class Palindrome {

    public boolean isPalindrome(int number) {
        int unitDigit = number % 10;
        int reversedNumber = (unitDigit);
        int restOfTheNumber = number / 10;
        int powerOfTen = 1;
        do {
            unitDigit = restOfTheNumber % 10;
            reversedNumber = (int) (reversedNumber * Math.pow(10,powerOfTen)) + unitDigit;

            restOfTheNumber = restOfTheNumber / 10;
        }while(restOfTheNumber != 0);

        System.out.println(reversedNumber);

        if (reversedNumber == number){
            System.out.println("Number is a palindrome");
            return true;
        }
        else {
            System.out.println("Number is not a palindrome");
            return false;
        }
    }
}

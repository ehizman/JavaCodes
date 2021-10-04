package chapterSix;
import java.util.Random;

public class CrapsGameOfChance {
    private enum Status { WON, LOST, CONTINUE};
    private static final Random randomNumber = new Random();

    public static void main(String ... args) throws InterruptedException {
        /*
         * Roll 2 Dice once
         * Determine if game has been lost or won or if game continues by classifying the sum of dice rolls
         * if the game continues roll dice again
         * After rolling dice if the sum of dice rolls is 7 then game has been lost, if sum of dice rolls
         * is the same as the first rolls of dice then the game has been won otherwise continue rolling the dice
         */
        int sumOfDice = rollDice();
        Status gameStatus;
        int point = 0;

        switch (sumOfDice){
            case 11:
            case 7:{
                gameStatus = Status.WON;
                Thread.sleep(2000);
                System.out.println("Player wins!");
                break;
            }
            case 12:
            case 3:
            case 2:{
                gameStatus = Status.LOST;
                Thread.sleep(2000);
                System.out.println("Player loses. House Wins!");
                break;
            }
            default:{
                gameStatus = Status.CONTINUE;
                point = sumOfDice;
                break;
            }
        }

        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();
            if (sumOfDice == 7){
                gameStatus = Status.LOST;
                Thread.sleep(2000);
                System.out.println("Player loses. House Wins!");
            }
            else{
                if (sumOfDice == point){
                    gameStatus = Status.WON;
                    Thread.sleep(2000);
                    System.out.println("Player wins!");
                }
            }
        }
    }

    private static int rollDice() throws InterruptedException {
        int faceOfDieOne = 1 + randomNumber.nextInt(6);
        int faceOfDieTwo = 1 + randomNumber.nextInt(6);
        int sumOfFaces = faceOfDieOne + faceOfDieTwo;
        String message = String.format(
                """
                First Die Roll: %d
                Second Die Roll: %d
                Sum of Roll Of Dice: %d
                """, faceOfDieOne, faceOfDieTwo, sumOfFaces
        );
        Thread.sleep(2000);
        System.out.printf(message + "%n");
        return sumOfFaces;
    }
}

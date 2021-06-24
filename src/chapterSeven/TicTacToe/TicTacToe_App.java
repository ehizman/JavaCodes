package chapterSeven.TicTacToe;

import commonOperations.IoOperations;

import javax.naming.NoPermissionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe_App {
    private static TicTacToe game = new TicTacToe();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws NoPermissionException {
        IoOperations.display("Tic-Tac_Toe");
        IoOperations.display(String.format("%20s", "------------------------------------"));
        String playerOneName;
        char playerOneMarker;
        String playerTwoName;
        char playerTwoMarker;
        try{
            System.out.print("Enter player one name: ");
            playerOneName = IoOperations.collectInput();
            do {
                System.out.println("Enter marker");
                System.out.print("Do not select '*': ");
                playerOneMarker = scanner.next().toCharArray()[0];
            } while (playerOneMarker == '*');
            System.out.print("Enter player two name: ");
            playerTwoName = IoOperations.collectInput();
            do {
                System.out.println("Enter marker");
                System.out.print("Do not select '*': ");
                playerTwoMarker = scanner.next().toCharArray()[0];
            }while (playerTwoMarker == '*');
            game.setPlayerOne(playerOneName, playerOneMarker);
            game.setPlayerTwo(playerTwoName, playerTwoMarker);
        } catch (NoPermissionException|NullPointerException | InputMismatchException e) {
            System.out.println("Error!");
        }
        displayBoard();
        int counter= 0;
        while (counter < 5) {
            try{
                int position = 0;
                System.out.println("Player One");
                System.out.println("Enter position to place marker");
                System.out.println("Board positions are numbered 1-9-> ");
                position = scanner.nextInt();
                play("Player One", position);
                displayBoard();
                if (game.checkGameStatus().equals(game.getPlayerOne().name+" wins!")){
                    System.out.println(game.checkGameStatus());
                    break;
                }
                System.out.println("Player Two");
                System.out.println("Enter position to place marker");
                System.out.println("Board positions are numbered 1-9-> ");
                position = scanner.nextInt();
                play("Player Two",position);
                displayBoard();
                if (game.checkGameStatus().equals(game.getPlayerTwo().name+" wins!")){
                    System.out.println(game.checkGameStatus());
                    break;
                }
                counter++;
                if (counter == 4){
                    System.out.println(game.checkGameStatus());
                    break;
                }
            }
            catch (NumberFormatException e){
                System.out.print("Invalid position");
            }
        }
    }

    private static void displayBoard() {
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(game.getBoard()[i][j] + "    ");
            }
            System.out.println();
            System.out.println();
        }
    }

    private static void play(String player, int position) throws NoPermissionException {
        if (player.equals("Player One")){
            game.playerOnePlay(position);
        }
        else{
            game.playerTwoPlay(position);
        }
    }
}

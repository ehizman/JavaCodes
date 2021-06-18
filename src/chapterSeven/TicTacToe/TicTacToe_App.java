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
            System.err.println("Error!");
        }
        displayBoard();
        play("Player One");
        displayBoard();
        play("Player Two");
        displayBoard();
        play("Player One");
        displayBoard();
        play("Player Two");
        displayBoard();
        play("Player One");
        displayBoard();
        if (game.checkGameStatus().equals(game.getPlayerOne().name+" wins!")){
            System.out.println(game.checkGameStatus());
        }
        else{
            play("Player Two");
            displayBoard();
            if (game.checkGameStatus().equals(game.getPlayerTwo().name+" wins!")){
                System.out.println(game.checkGameStatus());
            }
            else{
                play("Player One");
                displayBoard();
                if (game.checkGameStatus().equals(game.getPlayerOne().name+" wins!")){
                    System.out.println(game.checkGameStatus());
                }
                else{
                    play("Player Two");
                    displayBoard();
                    if (game.checkGameStatus().equals(game.getPlayerTwo().name+" wins!")){
                        System.out.println(game.checkGameStatus());
                    }
                    else{
                        play("Player One");
                        displayBoard();
                        if (game.checkGameStatus().equals(game.getPlayerOne().name+" wins!")){
                            System.out.println(game.checkGameStatus());
                        }
                        else{
                            System.out.println(game.checkGameStatus());
                        }
                    }
                }
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

    private static void play(String player){
        int position = 0;
        System.out.println(player);
        System.out.println("Enter position to place marker");
        System.out.println("Board positions are numbered 1-9-> ");
        if (player.equals("Player One")){
            try{
                position = scanner.nextInt();
                game.playerOnePlay(position);
            } catch (NoPermissionException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.err.println("Invalid position");;
            }
        }
        else{
            try{
                position = scanner.nextInt();
                game.playerTwoPlay(position);
                } catch (NoPermissionException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.err.println("Invalid position!");
            }
        }
    }
}

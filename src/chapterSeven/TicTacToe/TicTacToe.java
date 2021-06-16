package chapterSeven.TicTacToe;

import javax.naming.NoPermissionException;
import java.util.NoSuchElementException;

public class TicTacToe {
    public Board board = new Board();
    Player playerOne;
    Player playerTwo;
    private char playerOneMarker;
    private char playerTwoMarker;

    public void setPlayerOne(String name, char marker) throws NoPermissionException {
        playerOne = new Player(name, marker);
        if (marker == '*'){
            throw new NoPermissionException("Cannot use '*'. Please choose another marker" );
        }
        else{
            this.playerOneMarker = marker;
        }
    }

    public void setPlayerTwo(String name, char marker) throws NoPermissionException {
        playerTwo = new Player(name, marker);
        if (marker == '*'){
            throw new NoPermissionException("Cannot use '*'. Please choose another marker" );
        }
        else{
            this.playerTwoMarker = marker;
        }
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void playerOnePlay(int position) throws NoPermissionException {
        board.play(position, playerOneMarker);
    }

    public void playerTwoPlay(int position) throws NoPermissionException {
        board.play(position, playerTwoMarker);
    }

    public String checkGameStatus() {
        boolean isPlayerOneWinPatternOne =
                board.getBoard()[0][0] == playerOneMarker && board.getBoard()[0][1] == playerOneMarker && board.getBoard()[0][2] == playerOneMarker;
        boolean isPlayerOneWinPatternTwo =
                board.getBoard()[1][0] == playerOneMarker && board.getBoard()[1][1] == playerOneMarker && board.getBoard()[1][2] == playerOneMarker;
        boolean isPlayerOneWinPatternThree =
                board.getBoard()[2][0] == playerOneMarker && board.getBoard()[2][1] == playerOneMarker && board.getBoard()[2][2] == playerOneMarker;
        boolean isPlayerOneWinPatternFour =
                board.getBoard()[0][0] == playerOneMarker && board.getBoard()[1][0] == playerOneMarker && board.getBoard()[2][0] == playerOneMarker;
        boolean isPlayerOneWinPatternFive =
                board.getBoard()[0][1] == playerOneMarker && board.getBoard()[1][1] == playerOneMarker && board.getBoard()[2][1] == playerOneMarker;
        boolean isPlayerOneWinPatternSix =
                board.getBoard()[0][2] == playerOneMarker && board.getBoard()[1][2] == playerOneMarker && board.getBoard()[2][2] == playerOneMarker;
        boolean isPlayerOneWinPatternSeven =
                board.getBoard()[0][0] == playerOneMarker && board.getBoard()[1][1] == playerOneMarker && board.getBoard()[2][2] == playerOneMarker;
        boolean isPlayerOneWinPatternEight =
                board.getBoard()[0][2] == playerOneMarker && board.getBoard()[1][1] == playerOneMarker && board.getBoard()[2][0] == playerOneMarker;
        boolean isPlayerTwoWinPatternOne =
                board.getBoard()[0][0] == playerTwoMarker && board.getBoard()[0][1] == playerTwoMarker && board.getBoard()[0][2] == playerTwoMarker;
        boolean isPlayerTwoWinPatternTwo = board.getBoard()[1][0] == playerTwoMarker && board.getBoard()[1][1] == playerTwoMarker && board.getBoard()[1][2] == playerTwoMarker;
        boolean isPlayerTwoWinPatternThree = board.getBoard()[2][0] == playerTwoMarker && board.getBoard()[2][1] == playerTwoMarker && board.getBoard()[2][2] == playerTwoMarker;
        boolean isPlayerTwoWinPatternFour =
                board.getBoard()[0][0] == playerTwoMarker && board.getBoard()[1][0] == playerTwoMarker && board.getBoard()[2][0] == playerTwoMarker;
        boolean isPlayerTwoWinPatternFive =
                board.getBoard()[0][1] == playerTwoMarker && board.getBoard()[1][1] == playerTwoMarker && board.getBoard()[2][1] == playerTwoMarker;
        boolean isPlayerTwoWinPatternSix =
                board.getBoard()[0][2] == playerTwoMarker && board.getBoard()[1][2] == playerTwoMarker && board.getBoard()[2][2] == playerTwoMarker;
        boolean isPlayerTwoWinPatternSeven =
                board.getBoard()[0][0] == playerTwoMarker && board.getBoard()[1][1] == playerTwoMarker && board.getBoard()[2][2] == playerTwoMarker;
        boolean isPlayerTwoWinPatternEight =
                board.getBoard()[0][2] == playerTwoMarker && board.getBoard()[1][1] == playerTwoMarker && board.getBoard()[2][0] == playerTwoMarker;
        if (isPlayerOneWinPatternOne || isPlayerOneWinPatternTwo || isPlayerOneWinPatternThree ||isPlayerOneWinPatternFour||isPlayerOneWinPatternFive||isPlayerOneWinPatternSix||isPlayerOneWinPatternSeven||isPlayerOneWinPatternEight){
            return String.format("%s wins!",playerOne.name);
        }
        else{
            if(isPlayerTwoWinPatternOne || isPlayerTwoWinPatternTwo || isPlayerTwoWinPatternThree || isPlayerTwoWinPatternFour || isPlayerTwoWinPatternFive || isPlayerTwoWinPatternSix || isPlayerTwoWinPatternSeven || isPlayerTwoWinPatternEight){
                return String.format("%s wins!",playerTwo.name);
            }
            else{
                System.out.println(board.getBoard()[0][0]);
                System.out.println(playerOneMarker);
                return "Draw!";
            }
        }
    }
}

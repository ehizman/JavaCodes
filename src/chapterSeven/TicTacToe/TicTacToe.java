package chapterSeven.TicTacToe;

import javax.naming.NoPermissionException;

public class TicTacToe {
    public Board board = new Board();
    Player playerOne;
    Player playerTwo;
    private char playerOneMarker;
    private char playerTwoMarker;

    public void setPlayerOne(String name, char marker) {
        playerOne = new Player(name, marker);
        this.playerOneMarker = marker;
    }

    public void setPlayerTwo(String name, char marker) {
        playerTwo = new Player(name, marker);
        this.playerTwoMarker = marker;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void playerOnePlay(int position) throws NoPermissionException {
        board.play(position, playerOneMarker);
        board.displayBoard();
    }

    public void playerTwoPlay(int position) throws NoPermissionException {
        board.play(position, playerTwoMarker);
        board.displayBoard();
    }
//
//    public String checkGameStatus() {
//    }
}

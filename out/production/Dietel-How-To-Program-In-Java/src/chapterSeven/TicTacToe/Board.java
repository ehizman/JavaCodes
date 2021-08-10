package chapterSeven.TicTacToe;
import chapterSix.numberBaseConverters.BaseThreeConverter;

import javax.naming.NoPermissionException;

public class Board {
    private static char[][] board = null;
    public Board(){
        board = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
    }

    public void play(int position, char marker) throws NoPermissionException {
        int[] boardMap = BaseThreeConverter.convertToBaseThree(position-1);
        if (board[boardMap[0]][boardMap[1]] == '*'){
            board[boardMap[0]][boardMap[1]] = marker;
        }
        else {
            throw new NoPermissionException();
        }
    }

    public char[][] getBoard() { //make getBoard private. Display it from main()
        return board;
    }
}
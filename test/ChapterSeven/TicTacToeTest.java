package ChapterSeven;

import chapterSeven.TicTacToe.TicTacToe;
import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    @Test
    void testThatGameHasBoardOnConstruction(){
        TicTacToe game = new TicTacToe();
        assertArrayEquals(new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}},game.board.displayBoard());
    }

    @Test
    void thatGameHas2Players(){
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        assertEquals("Name: Ehis, Marker: X", game.getPlayerOne().toString());
        assertEquals("Name: Joshua, Marker: O", game.getPlayerTwo().toString());
    }

    @Test
    void thatPlayerOneCanPlay() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(5);
        assertArrayEquals(new char[][]{{'*','*','*'},{'*','X','*'},{'*','*','*'}}, game.board.displayBoard());
    }

    @Test
    void thatPlayerTwoCanPlay() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(5);
        game.playerTwoPlay(1);
        assertArrayEquals(new char[][]{{'O','*','*'},{'*','X','*'},{'*','*','*'}}, game.board.displayBoard());
    }

    @Test
    void thatPlayer2CannotPlayWherePlayer1HasPlayed() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(5);
        assertThrows(NoPermissionException.class,()->game.playerTwoPlay(5));
    }

    @Test
    void testThatPlayerWinsWhenHisMarkerAreOnCells1_2_3() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(1);
        game.playerTwoPlay(5);
        game.playerOnePlay(2);
        game.playerTwoPlay(6);
        game.playerOnePlay(3);
//        assertEquals("Ehis wins!",game.checkGameStatus());
    }
}

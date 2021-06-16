package ChapterSeven;

import chapterSeven.TicTacToe.TicTacToe;
import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    @Test
    void testThatGameHasBoardOnConstruction(){
        TicTacToe game = new TicTacToe();
        assertArrayEquals(new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}},game.board.getBoard());
    }

    @Test
    void thatGameHas2Players() throws NoPermissionException {
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
        assertArrayEquals(new char[][]{{'*','*','*'},{'*','X','*'},{'*','*','*'}}, game.board.getBoard());
    }

    @Test
    void thatPlayerTwoCanPlay() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(5);
        game.playerTwoPlay(1);
        assertArrayEquals(new char[][]{{'O','*','*'},{'*','X','*'},{'*','*','*'}}, game.board.getBoard());
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
    void testThatPlayerOneWinsWhenHisMarkerAreOnCells1_2_3() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(1);
        game.playerTwoPlay(5);
        game.playerOnePlay(2);
        game.playerTwoPlay(6);
        game.playerOnePlay(3);
        assertEquals("Ehis wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerOneWinsWhenHisMarkerAreOnCells4_5_6() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(4);
        game.playerTwoPlay(2);
        game.playerOnePlay(5);
        game.playerTwoPlay(7);
        game.playerOnePlay(6);
        assertEquals("Ehis wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerOneWinsWhenHisMarkerAreOnCells7_8_9() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(7);
        game.playerTwoPlay(5);
        game.playerOnePlay(8);
        game.playerTwoPlay(6);
        game.playerOnePlay(9);
        assertEquals("Ehis wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerOneWinsWhenHisMarkerAreOnCells1_4_7() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(1);
        game.playerTwoPlay(5);
        game.playerOnePlay(4);
        game.playerTwoPlay(6);
        game.playerOnePlay(7);
        assertEquals("Ehis wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerOneWinsWhenHisMarkerAreOnCells2_5_8() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(2);
        game.playerTwoPlay(4);
        game.playerOnePlay(5);
        game.playerTwoPlay(6);
        game.playerOnePlay(8);
        assertEquals("Ehis wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerOneWinsWhenHisMarkerAreOnCells3_6_9() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(3);
        game.playerTwoPlay(5);
        game.playerOnePlay(6);
        game.playerTwoPlay(7);
        game.playerOnePlay(9);
        assertEquals("Ehis wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerOneWinsWhenHisMarkerAreOnCells1_5_9() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(1);
        game.playerTwoPlay(4);
        game.playerOnePlay(5);
        game.playerTwoPlay(6);
        game.playerOnePlay(9);
        assertEquals("Ehis wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerOneWinsWhenHisMarkerAreOnCells3_5_9() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(3);
        game.playerTwoPlay(4);
        game.playerOnePlay(5);
        game.playerTwoPlay(6);
        game.playerOnePlay(7);
        assertEquals("Ehis wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerTwoWinsWhenHisMarkerAreOnCells1_2_3() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(5);
        game.playerTwoPlay(1);
        game.playerOnePlay(6);
        game.playerTwoPlay(2);
        game.playerOnePlay(7);
        game.playerTwoPlay(3);
        assertEquals("Joshua wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerTwoWinsWhenHisMarkerAreOnCells4_5_6() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(1);
        game.playerTwoPlay(4);
        game.playerOnePlay(3);
        game.playerTwoPlay(5);
        game.playerOnePlay(7);
        game.playerTwoPlay(6);
        assertEquals("Joshua wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerTwoWinsWhenHisMarkerAreOnCells7_8_9() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(5);
        game.playerTwoPlay(7);
        game.playerOnePlay(6);
        game.playerTwoPlay(8);
        game.playerOnePlay(3);
        game.playerTwoPlay(9);
        assertEquals("Joshua wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerTwoWinsWhenHisMarkerAreOnCells1_4_7() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(5);
        game.playerTwoPlay(1);
        game.playerOnePlay(6);
        game.playerTwoPlay(4);
        game.playerOnePlay(3);
        game.playerTwoPlay(7);
        assertEquals("Joshua wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerTwoWinsWhenHisMarkerAreOnCells2_5_8() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(3);
        game.playerTwoPlay(2);
        game.playerOnePlay(6);
        game.playerTwoPlay(5);
        game.playerOnePlay(7);
        game.playerTwoPlay(8);
        assertEquals("Joshua wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerTwoWinsWhenHisMarkerAreOnCells3_6_9() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(5);
        game.playerTwoPlay(3);
        game.playerOnePlay(2);
        game.playerTwoPlay(6);
        game.playerOnePlay(7);
        game.playerTwoPlay(9);
        assertEquals("Joshua wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerTwoWinsWhenHisMarkerAreOnCells1_5_9() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(3);
        game.playerTwoPlay(1);
        game.playerOnePlay(6);
        game.playerTwoPlay(5);
        game.playerOnePlay(7);
        game.playerTwoPlay(9);
        assertEquals("Joshua wins!",game.checkGameStatus());
    }

    @Test
    void testThatPlayerTwoWinsWhenHisMarkerAreOnCells3_5_7() throws NoPermissionException {
        TicTacToe game = new TicTacToe();
        game.setPlayerOne("Ehis", 'X');
        game.setPlayerTwo("Joshua", 'O');
        game.playerOnePlay(1);
        game.playerTwoPlay(3);
        game.playerOnePlay(6);
        game.playerTwoPlay(5);
        game.playerOnePlay(8);
        game.playerTwoPlay(7);
        assertEquals("Joshua wins!",game.checkGameStatus());
    }

    @Test
    void testThatThrowsExceptionWhenPlayerOneTriesToSetAsteriskAsMarker(){
        TicTacToe game = new TicTacToe();
        assertThrows(NoPermissionException.class, ()->game.setPlayerOne("Ehis", '*'));
    }

    @Test
    void testThatThrowsExceptionWhenPlayerTwoTriesToSetAsteriskAsMarker(){
        TicTacToe game = new TicTacToe();
        assertThrows(NoPermissionException.class, ()->game.setPlayerTwo("Ehis", '*'));
    }
}




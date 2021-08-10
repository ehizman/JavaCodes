package chapterSeven.TicTacToe;

public class Player {
    public String name;
    public char marker;

    public Player(String name, char marker) {
        this.name = name;
        this.marker = marker;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Marker: %s", name,marker);
    }
}

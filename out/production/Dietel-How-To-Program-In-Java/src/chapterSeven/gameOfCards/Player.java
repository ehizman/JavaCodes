package chapterSeven.gameOfCards;

public class Player {
    private final String playerName;
    private Card[] playerHand;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Card[] getPlayerHand(){
        return playerHand;
    }
    public String getPlayerName() {
        return playerName;
    }
}

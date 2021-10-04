package chapterSeven.gameOfCards;

import commonOperations.IoOperations;

public class CardGameApp {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();
        IoOperations.display("Enter number of players");
        Player[] players;
        try{
            int numberOfPlayers = Integer.parseInt(IoOperations.collectInput());
            players = new Player[numberOfPlayers];
            for (int i = 0; i < numberOfPlayers; i++) {
                IoOperations.display(String.format("%s%d","Enter name of player ",i + 1));
                String playerName = IoOperations.collectInput();
                Player player = new Player(playerName);
                players[i] = player;
            }
            Card[][] hands = deckOfCards.dealCard(numberOfPlayers,5);
            for (int i = 0; i < numberOfPlayers; i++){
                System.out.printf("%s's %s->   ",players[i].getPlayerName(),"Hand");
                for (Card card: hands[i]) {
                    try {
                        System.out.printf("%-20s", card.toString());
                    }
                    catch (NullPointerException e) {
                        System.out.print("No more card to deal! ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < hands.length; i++) {
                if (GameEngine.containsAPair(hands[i])){
                    IoOperations.display(String.format("%s holds a pair!",players[i].getPlayerName()));
                }
                if (GameEngine.containsTwoPairs(hands[i])){
                    IoOperations.display(String.format("%s holds two pairs!", players[i].getPlayerName()));
                }
            }
        }
        catch(NumberFormatException e){
            IoOperations.display("Enter a valid number!");
        }
    }

    public static void dealCard() {
    }
}

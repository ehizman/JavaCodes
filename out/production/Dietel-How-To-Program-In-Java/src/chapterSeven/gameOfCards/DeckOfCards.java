package chapterSeven.gameOfCards;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeckOfCards {

    private CardSuit[] suits = CardSuit.values();
    private CardFace[] faces = CardFace.values();
    private Card[] deckOfCards = new Card[52];

    public DeckOfCards(){
        int counter = 0;
        for (CardSuit suit : suits) {
            for (CardFace face: faces) {
                deckOfCards[counter] = new Card(face,suit);
                counter++;
            }
        }
    }

    public void displayDeckOfCards(){
        int counter = 0;
        for (CardFace face : faces) {
            for (CardSuit suit: suits) {
                System.out.printf("%-25s",deckOfCards[counter].toString());
                counter++;
            }
            System.out.println();
        }
    }

    public void shuffle(){
        Card[] copyOfDeck = new Card[deckOfCards.length];
        SecureRandom random = new SecureRandom();
        int randomIndex;
        for (int i = deckOfCards.length-1; i >=0 ; i--) {
            if (i == 0){
                randomIndex = 0;
            }
            else{
                randomIndex = random.nextInt(i);
            }
            copyOfDeck[deckOfCards.length - 1 - i] = deckOfCards[randomIndex];
            deckOfCards[randomIndex] = deckOfCards[i];
        }
        deckOfCards = copyOfDeck;
    }

    public Card[][] dealCard(int numberOfPlayers, int numberOfCardsToDeal){
        Card[][] hands = new Card[numberOfPlayers][numberOfCardsToDeal];
        int indexOfCurrentCard = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            Card[] playerHand = new Card[numberOfCardsToDeal];
            for (int j = 0; j < numberOfCardsToDeal; j++) {
                if (indexOfCurrentCard == deckOfCards.length){
                    throw new NullPointerException();
                }
                playerHand[j] = deckOfCards[indexOfCurrentCard];
                indexOfCurrentCard++;
            }
            hands[i] = playerHand;
        }
        return hands;
    }

    public void deal(Player[] players, int numberOfCardsToDeal){
        shuffle();
        for (Player player: players) {
            for (int j = 0; j < numberOfCardsToDeal; j++) {
                player.getPlayerHand()[j] = deckOfCards[j];
            }
        }
    }

    public HashMap<Player, List<Card>> dealCards(Player[] players, int numberOfCards){
        HashMap<Player, List<Card>> hashMap = new HashMap<>();
        List<Card> playerOneCards = new ArrayList<>();
        List<Card> playerTwoCards = new ArrayList<>();



        shuffle();
        for (int i = 0; i < numberOfCards; i++) {
            playerOneCards.add(deckOfCards[i]);
            playerTwoCards.add(deckOfCards[i + 1]);
            hashMap.put(players[0],playerOneCards);
            hashMap.put(players[1], playerTwoCards);
        }
        for(Player player: hashMap.keySet()){
            System.out.println(hashMap.get(player));
        }
        return hashMap;
    }
}

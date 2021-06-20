package chapterSeven.gameOfCards;

public class GameEngine {

    public static boolean containsAPair(Card[] playerHand){
        int countOfDuplicateFaces = 0;
        for (int i = 0; i < playerHand.length - 1; i++) {
            for (int j = i+1; j < playerHand.length ; j++) {
                if(playerHand[i].getCardFace() == playerHand[j].getCardFace()){
                    countOfDuplicateFaces++;
                }
            }
        }
        return countOfDuplicateFaces == 1;
    }
}

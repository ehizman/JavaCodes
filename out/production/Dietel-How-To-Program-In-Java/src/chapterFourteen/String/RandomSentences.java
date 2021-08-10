package chapterFourteen.String;

import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {
        String[] articles = new String[]{"a","one","some", "any"};
        String[] nouns = new String[]{"boy","girl","dog","town", "car"};
        String[] verbs = new String[]{"drove","jumped","ran","walked", "skipped"};
        String[] propositions = new String[]{"to","from","over","under", "on"};

        for (int i = 0; i < 20; i++) {
            int indexOfRandomArticle = generateRandomNumber(articles.length);
            String article = articles[indexOfRandomArticle];

            int indexOfRandomNoun = generateRandomNumber(nouns.length);
            String noun = nouns[indexOfRandomNoun];

            int indexOfRandomVerb = generateRandomNumber(verbs.length);
            String verb = verbs[indexOfRandomVerb];

            int indexOfRandomPreposition = generateRandomNumber(propositions.length);
            String preposition = propositions[indexOfRandomPreposition];

            int indexOfSecondRandomArticle = generateRandomNumber(articles.length);
            String secondArticle = articles[indexOfSecondRandomArticle];

            int indexOfSecondRandomNoun = generateRandomNumber(nouns.length);
            String secondNoun = nouns[indexOfSecondRandomNoun];


            System.out.printf("%s %s %s %s %s %s.%n", article.toUpperCase(Locale.ROOT).charAt(0) + article.substring(1),
                    noun
                    ,verb, preposition, secondArticle, secondNoun);
        }

    }

    private static int generateRandomNumber(int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound);
    }
}

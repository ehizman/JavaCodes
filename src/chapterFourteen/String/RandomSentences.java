package chapterFourteen.String;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {
        Random random = new Random();
        String[] articles = new String[]{"a","one","some", "any"};
        String[] nouns = new String[]{"boy","girl","dog","town", "car"};
        String[] verbs = new String[]{"drove","jumped","ran","walked", "skipped"};
        String[] propositions = new String[]{"to","from","over","under", "on"};

        Map<String, String> myMap = new HashMap<>();


        for (int i = 0; i < 20; i++) {
            int randomArticle = random.nextInt(articles.length);
            String article = articles[randomArticle];

            int randomNoun = random.nextInt(nouns.length);
            String noun = nouns[randomNoun];

            int randomVerb = random.nextInt(verbs.length);
            String verb = verbs[randomVerb];

            int randomPreposition = random.nextInt(propositions.length);
            String preposition = propositions[randomPreposition];

            int secondRandomArticle = random.nextInt(articles.length);
            String secondArticle = articles[secondRandomArticle];

            int secondRandomNoun = random.nextInt(nouns.length);
            String secondNoun = nouns[secondRandomNoun];


            System.out.printf("%s %s %s %s %s %s.%n", article.toUpperCase(Locale.ROOT).charAt(0) + article.substring(1),
                    noun
                    ,verb, preposition, secondArticle, secondNoun);
        }

    }
}

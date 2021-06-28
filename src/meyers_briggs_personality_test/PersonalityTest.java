package meyers_briggs_personality_test;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTest {
    public static void main(String[] args) {
        System.out.println("""
                Welcome to Meyers Briggs Personality Test
                You are required to answer 20 questions
                *** for each question, you are allowed to select either A or B (a or b) ***
                *** for any input other than A or B (a or b) the question repeats ***
                
                """);

        String[] questions =
                new String[]
                        {"""
                            Question 1:
                            a.expend energy, enjoy groups or
                            b.conserve energy, enjoy one-on-one
                         """,
                            """
                            Question 2:
                            a.interpret literally or
                            b.look for meaning and possibilities
                            """,
                            """
                            Question 3:
                            a.logical, thinking, questioning or
                            b.empathetic, feeling, accommodating
                            """,
                            """
                            Question 4:
                            a. organized, orderly or
                            b. flexible, adaptable
                            """,
                            """
                            Question 5:
                            a.more outgoing, think out loud or
                            b.more reserved, think to yourself
                            """,
                            """
                            Question 6:
                            a.practical, realistic, experiential or
                            b.imaginative, innovative, theoretical
                            """,
                            """
                            Question 7:
                            a. candid, straight forward, frank or
                            b. tactful, kind, encouraging
                            """,
                            """
                            Question 8:
                            a. plan, schedule or
                            b. unplanned, spontaneous
                            """,
                            """
                            Question 9:
                            a.seek many tasks, public activities, interaction with others
                            b.seek private, solitary activities with quiet to concentrate
                            """,
                            """
                            Question 10:
                            a.standard, usual, conventional or
                            b.different, novel, unique
                            """,
                            """
                            Question 11:
                            a.firm, tend to criticize, hold the line or
                            b.gentle, tend to appreciate, conciliate
                            """,
                            """
                            Question 12:
                            a.regulated, structured or
                            b.easygoing, “live” and “let live”
                            """,
                            """
                            Question 13:
                            a.external, communicative, express yourself or
                            b.internal, reticent, keep to yourself
                            """,
                            """
                            Question 14:
                            a.focus on here-and-now or
                            b.look to the future, global perspective, “big picture”
                            """,
                            """
                            Question 15:
                            a.tough-minded, just or
                            b.tender-hearted, merciful
                            """,
                            """
                            Question 16:
                            a.preparation, plan ahead or
                            b.go with the flow, adapt as you go
                            """,
                            """
                            Question 17:
                            a.active, initiate or
                            b.reflective, deliberate
                            """,
                            """
                            Question 18:
                            a.facts, things, “what is” or
                            b.ideas, dreams, “what could be,” philosophical
                            """,
                            """
                            Question 19:
                            a.matter of fact, issue-oriented or
                            b.sensitive, people-oriented, compassionate
                            """,
                            """
                            Question 20:
                            a.control, govern or
                            b.latitude, freedom
                            """
                        };
        Scanner scanner = new Scanner(System.in);
        int numberOfQuestions = 20;
        char[] answers = new char[numberOfQuestions];
        char temp;
        boolean isValidInput = false;
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println("Which of the following best describes you");
            System.out.println(questions[i]);
            System.out.print("Enter option here -> ");
                try{
                    temp = scanner.next().charAt(0);
                    if (temp == 'A' || temp =='B'||temp == 'a' || temp == 'b' ){
                        answers[i] = temp;
                        isValidInput = true;
                    }
                    else{
                        isValidInput = false;
                        throw new InvalidParameterException("Invalid option!");
                    }
                }catch (InvalidParameterException error){
                    System.out.println(error.getMessage());
                }
                if (!isValidInput){
                    i--;
                }
            System.out.println("\n".repeat(30));
        }
        System.out.println("Your personality test results -> ");
        String header = String.format("%5s%5s%5s"," ","A","B");
        System.out.printf(header.repeat(4));
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 1; i <= numberOfQuestions; i = i + 4) {
            System.out.printf("%5d",i);
            if(answers[i - 1] == 'A' || answers[i - 1] == 'a'){
                System.out.printf("%5s%5s","A"," ");
            }
            else{
                System.out.printf("%5s%5s"," ","B");
            }
            System.out.printf("%5d",i + 1);
            if(answers[i] == 'A' || answers[i] == 'a'){
                System.out.printf("%5s%5s","A"," ");
            }
            else{
                System.out.printf("%5s%5s"," ","B");
            }
            System.out.printf("%5d",i + 2);
            if(answers[i + 1] == 'A' || answers[i + 1] == 'a'){
                System.out.printf("%5s%5s","A"," ");
            }
            else{
                System.out.printf("%5s%5s"," ","B");
            }
            System.out.printf("%5d",i + 3);
            if(answers[i + 2] == 'A' || answers[i + 2] == 'a'){
                System.out.printf("%5s%5s","A"," ");
            }
            else{
                System.out.printf("%5s%5s"," ","B");
            }
            System.out.println();
        }
        int countOfAs = 0;
        int countOfBs = 0;
        System.out.println("---------------------------------------------------------------------------");

        System.out.printf("%5s","Total");
        String[] personalityDichotomies = new String[4];
        for (int i = 0; i < 4; i++) {
            countOfAs = 0;
            countOfBs = 0;
            if (answers[i] == 'A' || answers [i] == 'a'){
                countOfAs++;
            }
            else{
                countOfBs++;
            }
            if (answers[i + 4] == 'A' || answers [i + 4] == 'a'){
                countOfAs++;
            }
            else{
                countOfBs++;
            }
            if (answers[i + 8] == 'A' || answers [i + 8] == 'a'){
                countOfAs++;
            }
            else{
                countOfBs++;
            }
            if (answers[i + 12] == 'A' || answers [i + 12] == 'a'){
                countOfAs++;
            }
            else{
                countOfBs++;
            }
            if (answers[i + 16] == 'A' || answers [i + 16] == 'a'){
                countOfAs++;
            }
            else{
                countOfBs++;
            }
            System.out.printf("%5d%5d%5s",countOfAs, countOfBs," ");
            switch (i){
                case 0 -> {
                    if (countOfAs > countOfBs){
                        personalityDichotomies[i] = "Extrovert";
                    }
                    else{
                        personalityDichotomies[i] = "Introvert";
                    }
                }
                case 1 -> {
                    if (countOfAs > countOfBs){
                        personalityDichotomies[i] = "Sensing";
                    }
                    else{
                        personalityDichotomies[i] = "Intuition";
                    }
                }
                case 2 -> {
                    if (countOfAs > countOfBs){
                        personalityDichotomies[i] = "Thinking";
                    }
                    else{
                        personalityDichotomies[i] = "Feeling";
                    }
                }
                case 3 -> {
                    if (countOfAs > countOfBs){
                        personalityDichotomies[i] = "Judging";
                    }
                    else{
                        personalityDichotomies[i] = "Perceive";
                    }
                }
            }
        }
        System.out.println("\nYour personality type: ->");
        System.out.println(Arrays.toString(Arrays.stream(personalityDichotomies).toArray()));
    }
}

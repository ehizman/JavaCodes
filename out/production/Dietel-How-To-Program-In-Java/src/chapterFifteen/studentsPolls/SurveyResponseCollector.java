package chapterFifteen.studentsPolls;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class SurveyResponseCollector {
    public static void main(String[] args) {
        try(Formatter formatter = new Formatter("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java/src" +
                "/chapterFifteen/studentsPolls/numbers.txt");
        Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the survey responses. Press CTRL + D to end input");
            while (scanner.hasNext()){
                int value = scanner.nextInt();
                formatter.format("%d%s", value, " ");
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

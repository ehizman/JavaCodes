package chapterFifteen.studentsPolls;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentsPolls {
    public static void main(String[] args) {
        Map<Integer, Integer> polls = new HashMap<>();
        try(Scanner reader = new Scanner(Paths.get("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java/src/chapterFifteen/studentsPolls/numbers.txt"));
            Formatter formatter = new Formatter("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java/src" +
                    "/chapterFifteen/studentsPolls/output.txt")){
            while(reader.hasNext()){
                int response = reader.nextInt();
                if (polls.containsKey(response)){
                    polls.put(response, polls.get(response) + 1);
                }
                else{
                    polls.put(response, 1);
                }
            }
            for (Integer key: polls.keySet()) {
                formatter.format("%d%s%d\n", key, "       ", polls.get(key));
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

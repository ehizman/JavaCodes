package otherTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Reader {
    public static void main(String[] args) throws IOException {
        var url = new URL("https://www.oracle.com/");
        var conn = url.openConnection();
        var reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        System.out.println(reader);
    }
}

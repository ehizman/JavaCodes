package chapterFifteen;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a file name: ");
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get(scanner.nextLine());

        if (Files.exists(path)){
            System.out.printf("%s exists",  path.getFileName());

            System.out.println(Files.isDirectory(path) ? "is a directory": "is not a directory");

            System.out.println(path.isAbsolute() ? "Is an absolute path":"is not an absolute path");

            System.out.printf("last Modified time is: %s%n", Files.getLastModifiedTime(path));

            System.out.printf("Size: %d%n", Files.size(path));

            System.out.printf("Path: %s%n", path);

            System.out.printf("Absolute Path: %s%n", path.toAbsolutePath());

            System.out.println("Directory contents");

            DirectoryStream<Path> paths = Files.newDirectoryStream(path);

            for (Path directory: paths) {
                System.out.println(directory);
            }
        }
        else{
            System.out.println("File does not exist");
        }
    }
}

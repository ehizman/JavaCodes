package chapterEight.diaryProject;

import java.util.Scanner;

public class Diary_Application {

    public static void main(String ... args) {
        Diary diary;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the diary -> ");
        scanner.nextLine();
        String diaryName = scanner.nextLine();
        diary = new Diary(diaryName);
        System.out.println("\n diary created successfully!");
        try{
            run(diary);
        }catch (NoSuchFieldException error){
            System.out.println(error.getMessage());
        }
    }

    private static void run(Diary diary) throws NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        String promptMessage = """
                Press 1 to add a new entry
                Press 2 to find an entry by title
                Press 3 to delete an entry by title
                Press 4 to create a new diary
                Press 5 to exit application
                """;
        System.out.println(promptMessage);
        scanner.nextLine();
        int userInput = scanner.nextInt();

        switch(userInput){
            case 1 -> {
                System.out.print("Enter the the title of entry -> ");
                scanner.nextLine();
                String entryTitle = scanner.nextLine();
                System.out.print("Enter the the body of entry -> ");
                String entryBody = scanner.nextLine();
                Entry entry = new Entry();
                entry.setEntryTitle(entryTitle);
                entry.setEntryBody(entryBody);
                diary.addNewEntry(entry);
                System.out.println("\n new entry added successfully!");
                run(diary);
            }
            case 2 ->{
                System.out.print("Enter the the title of entry to find -> ");
                scanner.nextLine();
                String searchKey = scanner.nextLine();
                Entry entry = diary.findEntryByTitle(searchKey);
                if (entry == null){
                    throw new NoSuchFieldException(String.format("entry with title:%s does not exist", searchKey));
                }
                System.out.println(entry);
                run(diary);
            }
            case 3 -> {
                System.out.print("Enter the the title of entry to delete -> ");
                scanner.nextLine();
                String searchKey = scanner.nextLine();
                diary.deleteEntryByTitle(searchKey);
                System.out.println("Entry deleted!");
                run(diary);
            }
            case 4 -> {
                main();
            }
            case 5 -> {
                System.out.println("Exiting application!");
                System.exit(0);
            }
        }
    }
}

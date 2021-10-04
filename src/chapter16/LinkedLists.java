package chapter16;

import java.util.*;

public class LinkedLists {
    public static void main(String[] args) {
        String[] studentsInCohort7 = {"Aisha", "Johnson", "Aliyu", "Michael", "Oluwatobi"};
        List<String> listOfStudentsInCohort7 = new LinkedList<>(Arrays.asList(studentsInCohort7));
        String[] studentsInCohort8 = {"Dami", "Lopez", "Fyne", "Wix"};
        List<String> listOfStudentsInCohort8 = new LinkedList<>(Arrays.asList(studentsInCohort8));

        listOfStudentsInCohort8.addAll(listOfStudentsInCohort7);
        System.out.println("Original list: ");
        printList(listOfStudentsInCohort8);
        System.out.println();
        System.out.println("Removing Elements in list: ");
        removeElements(listOfStudentsInCohort8, 4, 7);
        System.out.println();
        System.out.println("List after elements have been removed: ");
        printList(listOfStudentsInCohort8);
        System.out.println();
        System.out.println("Turning elements in list to uppercase: ");
        turnToUpperCase(listOfStudentsInCohort8);
        printList(listOfStudentsInCohort8);
        printReverse(listOfStudentsInCohort8);
    }

    private static void printReverse(List<String> listOfStudentsInCohort8) {
        ListIterator<String> listIterator = listOfStudentsInCohort8.listIterator(listOfStudentsInCohort8.size());
        System.out.println("Reversed List: ");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }

    private static void turnToUpperCase(List<String> listOfStudentsInCohort8) {
        ListIterator<String> iterator = listOfStudentsInCohort8.listIterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            iterator.set(name.toUpperCase());
        }
    }

    private static void removeElements(List<String> listOfStudentsInCohort8, int start, int end) {
        listOfStudentsInCohort8.subList(start, end).clear();
    }

    private static void printList(Collection<String> listOfStudentsInCohort8) {
        for (String s : listOfStudentsInCohort8) {
            System.out.println(s);
        }
    }
}

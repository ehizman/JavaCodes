package chapterSeven.simpletron;

import java.util.Scanner;

public class SimpletronMain {
    public static void main(String[] args) throws Word.InvalidWordFormatException, Simpletron.InvalidStatementException {
        System.out.println("Select exercise to run");
        String input = new Scanner(System.in).next();

        switch (input.toLowerCase()){
            case "a" -> runExerciseA();
            case "b" -> runExerciseB();
            case "c" -> runExerciseC();
            default -> System.out.println("You have made an invalid selection!");
        }
    }

    private static void runExerciseC() {
    }

    private static void runExerciseB() {
    }

    private static void runExerciseA() throws Word.InvalidWordFormatException, Simpletron.InvalidStatementException {
        Simpletron simpletron = new Simpletron();
        simpletron.getMemory()[0] = new Word("2061");//load value at 61 into accumulator
        simpletron.getMemory()[61] = new Word("0010");
        simpletron.getMemory()[1] = new Word("1030");// read counter control variable
        simpletron.getMemory()[30] = new Word("+0000");
        simpletron.getMemory()[2] = new Word("3043");
        simpletron.getMemory()[2] = new Word("4160");//branch if negative to 60
        simpletron.getMemory()[60] = new Word("4300"); // halt program
        simpletron.getMemory()[3] = new Word("1032");//read first number into 32
        simpletron.getMemory()[30] = new Word(String.format("0%4s", Integer.parseInt(simpletron.getMemory()[30].getValue()) + 1));
        simpletron.getMemory()[5] = new Word("4160");
        simpletron.getMemory()[6] = new Word("1033");
        simpletron.getMemory()[30] = new Word(String.format("0%4s", Integer.parseInt(simpletron.getMemory()[30].getValue()) + 1));
        simpletron.getMemory()[8] = new Word("4160");
        simpletron.getMemory()[9] = new Word("1034");
        simpletron.getMemory()[10] = new Word("3034");

        int i = 0;
        while(true){
            try {
                simpletron.readStatement(simpletron.getMemory()[i]);
                i = i+1;
            }
            catch (Simpletron.InvalidStatementException ex){
                ex.printStackTrace();
            }
        }
    }
}

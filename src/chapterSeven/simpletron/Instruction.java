package chapterSeven.simpletron;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Instruction {
    READ("10"),
    WRITE("11"),
    LOAD("20"),
    STORE("21"),
    ADD("30"),
    SUBTRACT("31"),
    DIVIDE("32"),
    MULTIPLY("33"),
    BRANCH("40"),
    BRANCH_NEG("41"),
    BRANCH_ZERO("42"),
    HALT("43");

    private static final Map<String, Instruction> instructionMap = new HashMap<>();

    static {
        for (Instruction instruction: EnumSet.allOf(Instruction.class)) {
            instructionMap.put(instruction.command, instruction);
        }
    }

    private final String command;

    Instruction(String command) {
        this.command = command;
    }

    public static Map<String, Instruction> getInstructionMap(){
        return instructionMap;
    }
}

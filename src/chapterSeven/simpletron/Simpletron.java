package chapterSeven.simpletron;
public class Simpletron {
    private Byte accumulator = Byte.valueOf("0");
    private Word[] memory = new Word[100];

    public void readStatement(Word word) throws InvalidStatementException, Word.InvalidWordFormatException {
        Instruction instruction = Instruction.getInstructionMap().get(word.getInstruction());
        switch(instruction){
            case READ -> readInput(word.getData());
            case WRITE -> writeToConsole(word.getData());
            case LOAD -> loadToAccumulator(word.getData());
            case STORE -> storeIntoMemory(word.getData());
            case ADD -> addToAccumulator(word.getData());
            case SUBTRACT -> subtractFromAccumulator(word.getData());
            case DIVIDE -> divideWithValueInAccumulator(word.getData());
            case MULTIPLY -> multiply(word.getData());
            case BRANCH -> branch(word.getData());
            case BRANCH_NEG -> branchNeg(word.getData());
            case BRANCH_ZERO -> branchZero(word.getData());
            case HALT -> halt();
            default -> throw new InvalidStatementException();
        }
    }

    private void halt() {
        System.exit(0);
    }

    private void branchZero(String memoryLocation) throws InvalidStatementException, Word.InvalidWordFormatException {
        if (accumulator.intValue() == 0){
            Word statement = memory[Integer.parseInt(memoryLocation)];
            readStatement(statement);
        }
    }

    private void branchNeg(String memoryLocation) throws InvalidStatementException, Word.InvalidWordFormatException {
        if (accumulator.intValue() < 0){
            Word statement = memory[Integer.parseInt(memoryLocation)];
            readStatement(statement);
        }
    }

    private void branch(String memoryLocation) throws InvalidStatementException, Word.InvalidWordFormatException {
        Word statement = memory[Integer.parseInt(memoryLocation)];
        readStatement(statement);
    }

    private void multiply(String memoryLocation) {
        double result = accumulator.doubleValue() * Double.parseDouble(memory[Integer.parseInt(memoryLocation)].getValue());
        accumulator = Byte.valueOf(String.valueOf(result));
    }

    private void divideWithValueInAccumulator(String memoryLocation) {
        double result = accumulator.doubleValue() / Double.parseDouble(memory[Integer.parseInt(memoryLocation)].getValue());
        accumulator = Byte.valueOf(String.valueOf(result));
    }

    private void subtractFromAccumulator(String memoryLocation) {
        int result = accumulator.intValue() - Integer.parseInt(memory[Integer.parseInt(memoryLocation)].getValue());
        accumulator = Byte.valueOf(String.valueOf(result));
    }

    private void addToAccumulator(String memoryLocation) {
        int result = accumulator.intValue() + Integer.parseInt(memory[Integer.parseInt(memoryLocation)].getValue());
        accumulator = Byte.valueOf(String.valueOf(result));
    }

    private void storeIntoMemory(String memoryLocation) throws Word.InvalidWordFormatException {
        memory[Integer.parseInt(memoryLocation)] = new Word(String.format("0%4s", accumulator.toString()));
    }

    private void loadToAccumulator(String data) {
        accumulator = Byte.valueOf(memory[Integer.parseInt(data)].getValue());
    }

    private void writeToConsole(String index) {
        System.out.println(memory[Integer.parseInt(index)]);
    }

    private void readInput(String memoryLocation) {
        int cellIndex = Integer.parseInt(memoryLocation);
    }

    public byte getAccumulator() {
        return accumulator;
    }

    public Word[] getMemory() {
        return memory;
    }

    public void readInput(String data, String memoryLocation) {
        readInput("07");
    }

    static class InvalidStatementException extends Exception {
        InvalidStatementException(){
            super();
        }
    }
}

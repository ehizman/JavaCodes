package chapterSeven.simpletron;
public class Simpletron {
    private Byte accumulator = Byte.valueOf("0");
    private Byte[] memory = new Byte[100];

    public void readStatement(Word word, String data) throws InvalidStatementException {
        Instruction instruction = Instruction.getInstructionMap().get(word.getInstruction());
        switch(instruction){
            case READ -> readInput(word.getData(), data);
            case WRITE -> writeToConsole();
            case LOAD -> loadToAccumulator();
            case STORE -> storeIntoMemory();
            case ADD -> addToAccumulator();
            case SUBTRACT -> subtractFromAccumulator();
            case DIVIDE -> divideWithValueInAccumulator();
            case MULTIPLY -> multiply();
            case BRANCH -> branch();
            case BRANCH_NEG -> branchNeg();
            case BRANCH_ZERO -> branchZero();
            case HALT -> halt();
            default -> throw new InvalidStatementException();
        }

    }

    private void halt() {
    }

    private void branchZero() {
    }

    private void branchNeg() {
    }

    private void branch() {
    }

    private void multiply() {
    }

    private void divideWithValueInAccumulator() {
    }

    private void subtractFromAccumulator() {
    }

    private void addToAccumulator() {
    }

    private void storeIntoMemory() {
    }

    private void loadToAccumulator() {
    }

    private void writeToConsole() {
    }

    private void readInput(String memoryLocation, String data) {
        int cellIndex = Integer.parseInt(memoryLocation);
        memory[cellIndex] = Byte.parseByte(data);
    }

    public byte getAccumulator() {
        return accumulator;
    }

    public Byte[] getMemory() {
        return memory;
    }

    static class InvalidStatementException extends Exception {
        InvalidStatementException(){
            super();
        }
    }
}

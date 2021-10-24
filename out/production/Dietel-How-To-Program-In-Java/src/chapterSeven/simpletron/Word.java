package chapterSeven.simpletron;

public class Word {
    private String input;
    private String instruction;
    private String data;

    public Word(String input) throws InvalidWordFormatException {
        if (input.length() == 5){
            if (!(input.startsWith("+") || input.startsWith("-")) && ((input.lastIndexOf("+") != -1) || input.lastIndexOf("-") != -1)){
                throw new Word.InvalidWordFormatException();
            }
        }
        else{
            if (input.length() != 4){
                throw new Word.InvalidWordFormatException();
            }
        }

        this.input = input;
        this.instruction = input.substring(0,2);
        this.data = input.substring(2);
    }

    public String getInstruction() {
        return instruction;
    }

    public String getData(){
        return data;
    }

    public String getValue() {
        return this.input;
    }

    static class InvalidWordFormatException extends Exception {
        private InvalidWordFormatException(){
            super();
        }
    }
}

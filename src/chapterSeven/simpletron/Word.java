package chapterSeven.simpletron;

public class Word {
    private String input;
    private String instruction;
    private String data;

    public Word(String input){
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
}

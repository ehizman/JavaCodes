package chapterFifteen.exceptions;

public class SagesException extends Exception{
    public SagesException(){
        super();
    }
    public SagesException(String message){
        super(message);
    }
    public SagesException(String message, Throwable ex){
        super(message, ex);
    }
    public SagesException(Throwable ex){
        super(ex);
    }
}

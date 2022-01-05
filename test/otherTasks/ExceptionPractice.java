package otherTasks;

public class ExceptionPractice {
    public void check(int number) throws GreaterThanFiveException {
        if (number >= 5){
            throw new GreaterThanFiveException("number is greater than 5");
        }
        else{
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        ExceptionPractice practice = new ExceptionPractice();
        try{
            practice.check(5);
        }catch (GreaterThanFiveException ex){
            System.out.println(ex.getMessage());
        }
    }
}

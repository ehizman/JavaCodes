package chapterTen.Currency;

public abstract class Currency {
    abstract void convertTo();
    void spend(){
        System.out.println("I am spending the currency");
    }
}

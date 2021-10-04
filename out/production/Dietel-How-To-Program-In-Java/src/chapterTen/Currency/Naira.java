package chapterTen.Currency;

public class Naira extends Currency {
    void convertTo(){
        System.out.println("I am converting Naira");
    }

    void deValue(){
        System.out.println("I am devaluing");
    }

    @Override
    void spend() {
        System.out.println("I am spending money");;
    }
}

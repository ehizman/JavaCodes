package chapterTen.Currency;

public class currencyStockMarket {
    public static void main(String[] args) {
        Currency[] currencies = new Currency[3];
        Naira naira = new Naira();
        Dollars dollars = new Dollars();
        Pounds pounds = new Pounds();

        currencies[0] = naira;
        currencies[1] = dollars;
        currencies[2] = pounds;

        for (Currency currency: currencies) {
            currency.convertTo();
            currency.spend();
        }
        naira.deValue();

        String newString = "hello";
        String string = newString.replace("l", "L");
        System.out.println(string);

        String stringWithManySpaces = "     spaces     ";
        String stringWithSpacesRemoved = stringWithManySpaces.trim();
        System.out.println(stringWithManySpaces);
        System.out.println(stringWithSpacesRemoved);
    }
}

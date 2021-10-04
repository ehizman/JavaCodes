package ChapterThreeFiles.Invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }

    public double getInvoiceAmount(double price, int quantity) {
        return (price * quantity);
    }
}

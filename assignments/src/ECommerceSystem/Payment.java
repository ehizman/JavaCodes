package ECommerceSystem;

import java.util.Date;
import java.util.Random;

public class Payment {
    private int paymentId;
    private Date dateInitiated;
    private int amountToBePaid;
    private String detailsOfPayment;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId() {
        Random paymentId = new Random();
        this.paymentId = paymentId.nextInt(27283839);
    }

    public Date getDateInitiated() {
        return dateInitiated;
    }

    public void setDateInitiated(Date dateInitiated) {
        this.dateInitiated = dateInitiated;
    }

    public int getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(int amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }

    public String getDetailsOfPayment() {
        return detailsOfPayment;
    }

    public void setDetailsOfPayment(String detailsOfPayment) {
        this.detailsOfPayment = detailsOfPayment;
    }


}

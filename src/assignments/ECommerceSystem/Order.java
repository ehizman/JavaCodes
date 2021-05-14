package assignments.ECommerceSystem;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class Order {
   private Random orderId;
   private Date dateInitiated;
   private OrderStatus status;
   private Date expectedDateOfDelivery;
   private List<Product> products;
   private int subTotal;

    public void setExpectedDateOfDelivery(Date expectedDateOfDelivery) {
        this.expectedDateOfDelivery = expectedDateOfDelivery;
    }

    public Date getExpectedDateOfDelivery() {
        return expectedDateOfDelivery;
    }

    public Random  getOrderId() {
        return orderId;
    }

    public void setOrderId() {
        Random orderId = new Random();
        orderId.nextInt(1363);
        this.orderId = orderId;
    }

    public Date getDateInitiated() {
        return dateInitiated;
    }

    public void setDateInitiated(Date dateInitiated) {
        this.dateInitiated = dateInitiated;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status.equals("Delivered")) {
            this.status = OrderStatus.Delivered;
        }
        else {
            this.status = OrderStatus.NotDelivered;
        }
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int productPrice) {
        this.subTotal = productPrice;
    }
}

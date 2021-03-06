package cc.xpbootcamp.warmup.cashier;

import java.util.List;

public class Order {
    String customerName;
    String address;
    List<LineItem> lineItemList;

    public Order(String customerName, String address, List<LineItem> lineItemList) {
        this.customerName = customerName;
        this.address = address;
        this.lineItemList = lineItemList;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItemList;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0d;
        for (LineItem lineItem : this.getLineItems()) {
            totalPrice += lineItem.totalAmount() + lineItem.totalAmount() * .10;
        }
        return totalPrice;
    }

    public double calculateTotalSalesTax() {
        double totalSalesTax = 0d;
        for (LineItem lineItem : this.getLineItems()) {
            totalSalesTax += lineItem.totalAmount() * .10;
        }
        return totalSalesTax;
    }
}

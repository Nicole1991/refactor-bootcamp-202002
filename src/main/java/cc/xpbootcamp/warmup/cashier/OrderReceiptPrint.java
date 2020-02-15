package cc.xpbootcamp.warmup.cashier;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 *
 */
public class OrderReceiptPrint {
    private Order order;

    public OrderReceiptPrint(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        appendHeadersForPrint(output);

        // print date, bill no, customer name
//        output.append("Date - " + order.getDate();
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
//        output.append(order.getCustomerLoyaltyNumber());

        // prints lineItems
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');
        }

        // prints the state tax
        output.append("Sales Tax").append('\t').append(calculateTotalSalesTax());

        // print total amount
        output.append("Total Amount").append('\t').append(calculateTotalPrice());
        return output.toString();
    }

    private double calculateTotalSalesTax() {
        double totalPrice = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            totalPrice += lineItem.totalAmount() + lineItem.totalAmount() * .10;
        }
        return totalPrice;
    }

    private double calculateTotalPrice() {
        double totalSalesTax = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            double salesTax = lineItem.totalAmount() * .10;
            totalSalesTax += salesTax;
        }
        return totalSalesTax;
    }

    private void appendHeadersForPrint(StringBuilder output) {
        output.append("======Printing Orders======\n");
    }
}
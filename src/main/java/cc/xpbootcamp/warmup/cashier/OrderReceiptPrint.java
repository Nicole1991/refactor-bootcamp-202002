package cc.xpbootcamp.warmup.cashier;

public class OrderReceiptPrint {
    private Order order;

    public OrderReceiptPrint(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        appendHeadersForPrint(output);
//        output.append("Date - " + order.getDate();
        appendCustomerNameAndAddressForPrint(output);
//        output.append(order.getCustomerLoyaltyNumber());
        appendLineItemsForPrint(output);
        appendPriceForPrint(output, "Sales Tax", calculateTotalSalesTax());
        appendPriceForPrint(output, "Total Amount", calculateTotalPrice());

        return output.toString();
    }

    private void appendPriceForPrint(StringBuilder output, String s, double v) {
        output.append(s).append('\t').append(v);
    }

    private void appendLineItemsForPrint(StringBuilder output) {
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
    }

    private void appendCustomerNameAndAddressForPrint(StringBuilder output) {
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());
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
            totalSalesTax += lineItem.totalAmount() * .10;
        }
        return totalSalesTax;
    }

    private void appendHeadersForPrint(StringBuilder output) {
        output.append("======Printing Orders======\n");
    }
}
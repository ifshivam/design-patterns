package org.example.strategypattern.notused;

public class ShoppingCart {
    private String customerType; // e.g., "Guest", "Regular", "VIP"

    public ShoppingCart(String customerType) {
        this.customerType = customerType;
    }

    public double checkout(double totalAmount) {
        if (customerType == null) {
            throw new IllegalStateException("Customer type is not set.");
        }

        switch (customerType) {
            case "Guest":
                return totalAmount; // No discount
            case "Regular":
                return totalAmount * 0.90; // 10% discount
            case "VIP":
                return totalAmount * 0.80; // 20% discount
            default:
                throw new IllegalArgumentException("Unknown customer type: " + customerType);
        }
    }
}

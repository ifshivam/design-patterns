package org.example.strategypattern.used;

public class VIPCustomerDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.80; // 20% discount
    }
}

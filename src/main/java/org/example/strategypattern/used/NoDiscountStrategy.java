package org.example.strategypattern.used;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount; // No discount applied
    }
}

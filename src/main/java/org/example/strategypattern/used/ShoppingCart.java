package org.example.strategypattern.used;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public double checkout(double totalAmount) {
        if (discountStrategy == null) {
            throw new IllegalStateException("Discount strategy is not set.");
        }
        return discountStrategy.applyDiscount(totalAmount);
    }
}


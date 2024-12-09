package org.example.strategypattern.used;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Guest Customer
        cart.setDiscountStrategy(new NoDiscountStrategy());
        System.out.println("Guest Checkout Total: " + cart.checkout(100));

        // Regular Customer
        cart.setDiscountStrategy(new RegularCustomerDiscountStrategy());
        System.out.println("Regular Customer Checkout Total: " + cart.checkout(100));

        // VIP Customer
        cart.setDiscountStrategy(new VIPCustomerDiscountStrategy());
        System.out.println("VIP Customer Checkout Total: " + cart.checkout(100));
    }
}

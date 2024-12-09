package org.example.strategypattern.notused;

public class Main {
    public static void main(String[] args) {
        ShoppingCart guestCart = new ShoppingCart("Guest");
        System.out.println("Guest Checkout Total: " + guestCart.checkout(100));

        ShoppingCart regularCart = new ShoppingCart("Regular");
        System.out.println("Regular Customer Checkout Total: " + regularCart.checkout(100));

        ShoppingCart vipCart = new ShoppingCart("VIP");
        System.out.println("VIP Customer Checkout Total: " + vipCart.checkout(100));
    }
}

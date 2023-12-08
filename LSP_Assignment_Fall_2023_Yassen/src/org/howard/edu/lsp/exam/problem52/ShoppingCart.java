package org.howard.edu.lsp.exam.problem52;

// Class representing a shopping cart that uses a payment strategy
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Setter method to set the payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to perform checkout using the specified payment strategy
    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}

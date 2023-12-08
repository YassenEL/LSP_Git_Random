// PaymentStrategyDriver.java
package org.howard.edu.lsp.exam.problem52;

// Main driver class to demonstrate the Strategy Pattern
public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.0);

        // PayPal Payment
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50.0);

        // Bitcoin Payment
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
        cart.setPaymentStrategy(bitcoinPayment);
        cart.checkout(75.0);
    }
}

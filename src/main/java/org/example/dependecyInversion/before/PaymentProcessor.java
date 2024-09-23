package org.example.dependecyInversion.before;

/**
 * The Dependency Inversion Principle (DIP) is one of the five SOLID principles of object-oriented design.
 * It states that high-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Additionally, abstractions should not depend on details.
 * Details should depend on abstractions.
 */
public class PaymentProcessor {
    private CreditCard creditCard;

    private Paypal paypal;

    public PaymentProcessor(CreditCard creditCard, Paypal paypal) {
        this.creditCard = creditCard;
        this.paypal = paypal;
    }

    public void process(double amount){
        creditCard.doPayment();
        paypal.doPayment();
    }
}

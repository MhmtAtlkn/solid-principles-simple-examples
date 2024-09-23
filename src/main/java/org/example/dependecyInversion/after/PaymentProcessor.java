package org.example.dependecyInversion.after;

import org.example.dependecyInversion.before.CreditCard;
import org.example.dependecyInversion.before.Paypal;

public class PaymentProcessor {

    PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.doPayment();
    }
}

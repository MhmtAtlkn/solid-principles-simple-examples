package org.example.dependecyInversion.after;

public class CreditCard implements PaymentMethod {

    @Override
    public void doPayment() {
        System.out.println("Credit card paying...");
    }
}

package org.example.dependecyInversion.after;

public class Paypal implements PaymentMethod{

    @Override
    public void doPayment(){
        System.out.println("Paypal is paying..");
    }
}

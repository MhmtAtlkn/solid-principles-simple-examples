package org.example.liskovSubstitution;

public class Sparrow extends Bird {
    @Override
    public void fly() {
        //adheres to LSP
        System.out.println("Sparrow is flying");
    }
}

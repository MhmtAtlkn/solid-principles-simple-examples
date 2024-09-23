package org.example.liskovSubstitution;

public class Ostrich extends Bird{
    @Override
    public void fly() {
        // violates LSP
        // Ostriches Can not fly
    }
}

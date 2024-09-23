package org.example.interfaceSegregation.after;

public class Human implements Workable, Eatable {
    @Override
    public void eat() {
        // OK
    }

    @Override
    public void work() {
        // OK
    }
}

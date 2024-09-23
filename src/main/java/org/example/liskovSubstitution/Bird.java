package org.example.liskovSubstitution;

/**
 * The Liskov Substitution Principle (LSP) is another one of the five SOLID principles of object-oriented design.
 * It states that objects of a superclass should be replaceable with objects of a subclass without affecting
 * the correctness of the program. In other words, subclasses should be able to substitute their base classes without
 * the client code knowing the difference.
 */
public class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

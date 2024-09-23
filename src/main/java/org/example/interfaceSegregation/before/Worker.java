package org.example.interfaceSegregation.before;

// Violates ISP

/**
 * The Interface Segregation Principle (ISP) is one of the five SOLID principles of object-oriented design.
 * It states that no client should be forced to depend on methods it does not use. In other words,
 * larger interfaces should be split into smaller, more specific ones so that clients only need
 * to know about the methods that are of interest to them.
 */
public interface Worker {
    void work();

    void eat();
}

package org.example.singleResponsibility;

/**
 * The Single Responsibility Principle (SRP) is one of the five SOLID principles of object-oriented design.
 * It states that a class should have only one reason to change, meaning it should have only one job or responsibility.
 * This principle helps in making the code more modular, easier to understand, maintain, and test.
 */
public class UserService {
    public void addUser(String user) {
        // Add Users
    }

    public void sendEmail(String email) {
        // Send Email
        // Why not move to the email service?
    }
}

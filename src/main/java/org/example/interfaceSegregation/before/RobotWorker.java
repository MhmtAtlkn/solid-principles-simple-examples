package org.example.interfaceSegregation.before;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        // ???
        // Can be throw Unsupported exception. But it will break LSP principle.
    }
}

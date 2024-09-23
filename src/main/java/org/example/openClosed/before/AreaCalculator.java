package org.example.openClosed.before;

/**
 * The Open/Closed Principle (OCP) is another one of the five SOLID principles of object-oriented design.
 * It states that software entities (classes, modules, functions, etc.) should be open for extension
 * but closed for modification.
 * This means that the behavior of a module can be extended without modifying its source code.
 */
public class AreaCalculator {

    public double calculateArea(Rectangle rectangle) {
        // what if another type is coming? Changing the code...add if else ?
        return rectangle.length * rectangle.width;
    }

    public class Rectangle {
        public double length;
        public double width;
    }
}
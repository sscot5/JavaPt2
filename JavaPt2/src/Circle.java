/*
 * Filename: Circle.java 
 * Last modified on October 7, 2021 
 * 
 * Course: IT 168
 * Lab Section: 3
 */

/**
 * This is a simple circle class with methods to return and set the radius,
 * calculate the area, calculate the diameter, and calculate the circumference.
 * 
 * @author Stephanie Scott
 */

public class Circle {

    private double radius;
    private final double PI = 3.14159;

    /**
     * Constructor
     * 
     * @param initRadius - the initial radius of the circle
     */
    public Circle(double initRadius) {
        this.radius = initRadius;
    }

    /**
     * Getter for radius
     * 
     * @return the current radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Setter for radius
     * 
     * @param newRadius The new radius for the circle
     */
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    /**
     * Calculates the area of the circle
     * 
     * @return area
     */
    public double calculateArea() {
        double area = PI * radius * radius;
        return area;
    }

    /**
     * Calculates the diameter of the circle
     * 
     * @return diameter of the circle
     */
    public double calculateDiameter() {
        double diameter = radius * 2;
        return diameter;
    }

    /**
     * Calculates the circumference of the circle
     * 
     * @return circumference of the circle
     */
    public double calculateCircumference() {
        double circumference = 2 * PI * radius;
        return circumference;
    }
}
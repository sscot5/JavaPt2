/*
 * Filename: RoomDimension.java 
 * Last modified on October 21, 2021 
 * 
 * Course: IT 168
 * Lab Section: 3
 */

//package ilstu.edu;

/**
 * This is a simple Room Dimension class that takes the length and width of a
 * room and calculates the area of the room.
 * 
 * @author Stephanie Scott
 */
public class RoomDimension {

    // instance varibles
    private double length;
    private double width;

    /**
     * Constructor
     * 
     * @param length
     * @param width
     */
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Get Area function: returns the area of the room by calculating the length x
     * width
     * 
     * @return the area of the room
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Overriden toString method
     * 
     * @return a String with
     */
    @Override
    public String toString() {
        return "Room dimension is length: " + length + " width: " + width + " area: " + this.getArea();
    }
}

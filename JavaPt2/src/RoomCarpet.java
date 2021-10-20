/*
 * Filename: RoomCarpet.java 
 * Last modified on October 21, 2021 
 * 
 * Course: IT 168
 * Lab Section: 3
 */

//package ilstu.edu;
import java.text.NumberFormat;

/**
 * This is a Room Carpet class
 * 
 * @author Stephanie Scott
 */

public class RoomCarpet {

    // instance varibles
    private RoomDimension rmDim;
    private double costPerSqFt;

    /**
     * Constructor
     * 
     * @param rmDim
     * @param costPerSqFt
     */
    public RoomCarpet(RoomDimension rmDim, double costPerSqFt) {
        this.rmDim = rmDim;
        this.costPerSqFt = costPerSqFt;
    }

    /**
     * Get Cost calculates the cost of the carpet by taking the cost per square foot
     * and multiplying it by the area of the room.
     * 
     * @return cost of carpeting the room
     */
    public double getCost() {
        return costPerSqFt * rmDim.getArea();
    }
    // to string

    @Override
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return "Cost of carpet per square foot: " + fmt.format(costPerSqFt) + "\nTotal cost is "
                + fmt.format(this.getCost());
    }
}

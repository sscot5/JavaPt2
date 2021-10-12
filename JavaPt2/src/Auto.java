
/* 
* Date: October 8, 2021
* ULID: sscot17
* Class: IT 168
*/
import java.text.DecimalFormat;

/**
 * Description: This is a simple airport class with methods
 * 
 * @author Stephanie Scott
 */

public class Auto {

    // instance varibles
    private String model;
    private int milesDriven;
    private double gallonsOfGas;
    private static int countAutos = 0;

    /**
     * Default Constructor
     * 
     * initializes model to "unkown"; miles Driven to 0; and gallonsOfGas to 0.0;
     */
    public Auto() {
        model = "unknown";
        countAutos++;
    }

    /**
     * Overload Constructor
     * 
     * @param model        - the model of the auto
     * @param milesDriven  - the number of miles driven
     * @param gallonsOfGas - the number of gallons of gas
     * 
     *                     function: allows client to set beginning values for
     *                     model, milesDriven, and gallonsOfGas
     */
    public Auto(String startModel, int startMilesDriven, double startGallonsOfGas) {
        model = startModel;
        setMilesDriven(startMilesDriven);
        setGallonsOfGas(startGallonsOfGas);
        countAutos++;
    }

    /**
     * Getter for model
     * 
     * @return the current model
     */
    public String getModel() {
        return model;
    }

    /**
     * Getter for miles driven
     * 
     * @return the current miles driven
     */
    public int getMilesDriven() {
        return milesDriven;
    }

    /**
     * Getter for gallons of gas
     * 
     * @return the current gallons of gas
     */
    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    /**
     * Getter for count of autos
     * 
     * @return the current count of autos
     */
    public static int getCountAutos() {
        return countAutos;
    }

    /**
     * Setter for the name of the model
     * 
     * @param model The new name for the model
     */
    public Auto setModel(String model) {
        this.model = model;
        return this; // model is an instance. this method is returning the object Auto with the new
                     // values
    }

    /**
     * Setter for the number of miles driven
     * 
     * @param milesDriven
     */
    public Auto setMilesDriven(int milesDriven) {
        if (milesDriven >= 0) {
            this.milesDriven = milesDriven;
        }
        return this;
    }

    /**
     * Setter for the number of gallons of gas
     * 
     * @param gallonsOfGas
     */
    public Auto setGallonsOfGas(double gallonsOfGas) {
        if (gallonsOfGas >= 0.0) {
            this.gallonsOfGas = gallonsOfGas;
        }
        return this;
    }

    /**
     * Checks if the gallons of gas is greater than 0. If so, it calculates the
     * miles per gallon
     * 
     * @return milesPerGallon
     */
    public double milesPerGallon() {
        if (gallonsOfGas >= 0.001) {
            return milesDriven / gallonsOfGas;
        } else {
            return 0.0;
        }
    }

    /**
     * Calculates the money spent on gas
     * 
     * @return money spent on gas
     */
    public double moneySpentOnGas(double pricePerGallon) {
        return pricePerGallon * gallonsOfGas;
    }

    /**
     * Overridden toString method
     * 
     * @return a string containing the model, miles driven, and gallons of gas
     *         formatted to the hundredths decimal
     */
    @Override
    public String toString() {
        DecimalFormat gallonsFormat = new DecimalFormat("#0.00");
        return "Model: " + model + "; miles driven: " + milesDriven + "; gallons of gas: "
                + gallonsFormat.format(gallonsOfGas);
    }

    // equals: returns true if fields of parameter object are equal to fields in
    // this object
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Auto)) {
            return false;
        } else {
            Auto objAuto = (Auto) o;
            if (model.equals(objAuto.model) && milesDriven == objAuto.milesDriven
                    && Math.abs(gallonsOfGas - objAuto.gallonsOfGas) < 0.0001)
                return true;
            else
                return false;
        }
    }

    // public static Test expect(Auto auto) {
    // return new Test(auto);
    // }

    // public boolean equal(Object o) {
    // if (!(o instanceof Auto)) {
    // return false;
    // } else {
    // Auto objAuto = (Auto) o;
    // if (model.equals(objAuto.model)
    // && milesDriven == objAuto.milesDriven
    // && Math.abs(gallonsOfGas - objAuto.gallonsOfGas) < 0.0001)
    // return true;
    // else
    // return false;
    // }
    // }

    // public Auto to() {
    // return this;
    // }
}

// Auto auto = new Auto(stuff)
// Auto auto2 = new Auto(other stuff)

// Test.expect(auto).to().equal(auto2)
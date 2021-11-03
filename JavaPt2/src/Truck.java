public class Truck {

    private int cylinders;
    private String manufacturer;
    private double load;
    private double tow;

    public Truck() {
        this(0);
    }

    public Truck(int cylinders) {
        this(cylinders, null);
    }

    public Truck(int cylinders, String manufacturer) {
        this(cylinders, manufacturer, 0.0);
    }

    public Truck(int cylinders, String manufacturer, double load) {
        this(cylinders, manufacturer, load, 0.0);
    }

    public Truck(int cylinders, String manufacturer, double load, double tow) {
        this.cylinders = cylinders;
        this.manufacturer = manufacturer;
        this.load = load;
        this.tow = tow;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public double getTow() {
        return tow;
    }

    public void setTow(double tow) {
        this.tow = tow;
    }

    @Override
    public String toString() {
        return "Cylinders: " + cylinders + "; Manufacterer: " + manufacturer + "; Load: " + load + "; Tow: " + tow;
    }
}

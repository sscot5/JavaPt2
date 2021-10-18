public class CoffeeExpenses {
    private double[] purchases;
    private String[] dates;

    public static void main(String[] args) {
        CoffeeExpenses april = new CoffeeExpenses();
        april.loadData();
        System.out.println(april.getTotal());
    }

    public static double getRandomDouble(int min, int max) {
        double num = (Math.random() * (max - min)) + min;
        return ((int) (num * 100) / 100.0);
    }

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    // constructor creates an empty array to add costs to it
    public CoffeeExpenses() {
        purchases = new double[0];
        dates = new String[0];
    }

    public void addPurchase(double newPurchase) {
        double[] newPurchArray = new double[purchases.length + 1]; // creating a new array with a size of 1

        for (int i = 0; i < purchases.length; i++) {
            newPurchArray[i] = purchases[i]; // adding each purchase to the array starting at index of 0 and increasing
                                             // by 1 each itteration;
        }

        newPurchArray[newPurchArray.length - 1] = newPurchase;
        purchases = newPurchArray;
    }

    // public double getTotal() {
    // double total = 0;

    // for (int i = 0; i < purchases.length; i++) {
    // total += purchases[i];
    // }

    // return total;
    // }

    // can use this for loop structure for anything that is iterrable (i.e. arrays,
    // lists, ect.)
    public double getTotal() {
        double total = 0;

        // for loops are used when we have an known number of loops
        // forEach loops are used when we have a list (an array is a list)

        for (double purchase : purchases) {
            total += purchase;
        }

        return total;
    }

    public void addDate(String newDates) {
        String[] newDateArray = new String[dates.length + 1];

        for (int i = 0; i < dates.length; i++) {
            newDateArray[i] = dates[i];

            newDateArray[newDateArray.length - 1] = newDates;
            dates = newDateArray;
        }
    }

    public void buyCoffee(String date, double purchase) {
        addDate(date);
        addPurchase(purchase);
    }

    public void loadData() {
        int daysToTrack = CoffeeExpenses.getRandomInt(4, 14);
        for (int i = 0; i < daysToTrack; i++) {
            double purch = CoffeeExpenses.getRandomDouble(2, 6);
            String day = "04-" + (i + 1) + "-2021";
            buyCoffee(day, purch);
        }
    }
}

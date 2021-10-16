import java.util.Random;

public class CoffeeExpenses {
    private double[] purchases;
    private String[] dates;

    public static void main(String[] args) {
        CoffeeExpenses april = new CoffeeExpenses();
        april.addPurchase(4.67);
        april.addPurchase(5.76);
        System.out.println(april.getTotal());
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

    public void buyCoffee(String dates, double purchase) {
        addDate(dates);
        addPurchase(purchase);
    }

    public void loadData() {
        int start = 6;
        int end = 10;
        int rand = new Random().nextInt();
        int daysToTrack = start + (rand * (end - start));
        for (int i = 0; i < daysToTrack; i++) {
            double doubleRandom = new Random().nextDouble();
            double purch = 1.01 + (doubleRandom * (9.99 - 1.01));
            String day = "04-" + (i + 1) + "-2021";
            buyCoffee(day, purch);
        }
    }
}

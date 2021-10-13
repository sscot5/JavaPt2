/*
 * Filename: Time.java 
 * Last modified on October 12, 2021 
 * 
 * Course: IT 168
 * Lab Section: 3
 */

/**
 * This is a simple time class
 * 
 * @author Stephanie Scott
 */

public class Time {

    // instance varibles
    private int hours; // stored in standard 24-hour time must be between 0 - 23
    private int minutes; // must be between 0 - 59

    /**
     * Default Constructor
     * 
     * initializes the time to midnight
     */
    public Time() {
        hours = 0;
        minutes = 0;
    }

    /**
     * Overload Constructor
     * 
     * @param hours
     * @param minutes
     * 
     *                function: allows client to set beginning time in 24-hour
     *                format. validates hours is between 0 - 23 and minutes is
     *                between 0 - 59; if not sets time to midnight
     */
    public Time(int hrs, int mins) {
        setHours(hours);
        setMinutes(minutes);
    }

    /**
     * Overload Constructor
     * 
     * @param hours
     * @param minutes function: allows client to set beginning time in a 12-hour
     *                format. validates hours is between 1 - 12 and minutes is
     *                between 0 - 59; and String is either AM or PM; if not it sets
     *                the time to midnight
     */
    public Time(int hrs, int mins, String ampm) {
        setMinutes(mins);
        if (ampm.toUpperCase().equals("AM")) {
            setHours(hrs);
        } else if (ampm.toUpperCase().equals("PM")) {
            setHours((hrs + 12) % 24);
        } else {
            setHours(0);
            setMinutes(0);
        }
    }

    /**
     * Setter for the hours
     * 
     * @param hours
     */
    public Time setHours(int hours) {
        if (hours <= 23 && hours >= 0) {
            this.hours = hours;
        }
        return this;
    }

    /**
     * Setter for the minutes
     * 
     * @param minutes
     */
    public Time setMinutes(int minutes) {
        if (minutes <= 59 && minutes >= 0) {
            this.minutes = minutes;
        }
        return this;
    }

    /**
     * Getter for hours
     * 
     * @return the current hours in a 24-hour time format
     */
    public int getHours() {
        return hours;
    }

    /**
     * Getter for minutes
     * 
     * @return the current minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * equals method
     * 
     * function: checks to see if this time is equal to another time
     */
    public boolean equals(Object o) {
        if (o instanceof Time) {
            boolean areHoursEqual = this.hours == ((Time) o).getHours();
            boolean areMinutesEqual = this.minutes == ((Time) o).getMinutes();
            return areHoursEqual && areMinutesEqual;
        }
        return false;
    }

    /**
     * Overrideen toString method
     * 
     * @return a String with the time in the form hh:mm, where hh can range from 00
     *         to 23.
     */
    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

    /**
     * Converts the 24-hour time format to a 12-hour time format
     * 
     * @return a String with the time in the form hh:mm AM or hh:mm PM
     */
    public String get12HourTime() {
        int hrs = this.hours;
        String ampm = "AM";
        if (hrs > 12) {
            hrs -= 12;
            ampm = "PM";
        }
        return hrs + ":" + minutes + " " + ampm;
    }
}

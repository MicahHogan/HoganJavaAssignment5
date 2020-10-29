import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * Date constructs an instanced object of Class date with integers
 * year, month, and day passed as parameters.  Date throws an IllegalArgumentException
 * in the case it is passed a negative value as year, OR a value less than 1 or greater
 * than 12 as month, OR a value less than 1 or greater than 31 as day.
 *
 * @author Micah Hogan
 * @version 03/10/20
 */
public class Date
{
    private int year;
    private int month;
    private int day;

    /**
     * Constructor for objects of class Date
     * 
     * @param       year        Integer year of date to be stored
     * @param       month       Integer month of date to be stored
     * @param       day         Integer day of date to be stored
     */
    public Date(int year, int month, int day)
    {
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    
    /**
     * Set method for instanced objects of class Date
     * 
     * @param       year        Integer year of date to be stored
     */
    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Please use a positive value for year.");
        }
        this.year = year;
    }
    
    /**
     * Set method for instanced objects of class Date
     * 
     * @param       month       Integer month of date to be stored
     */
    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Please use a value between 1 and 12 for month.");
        }
        this.month = month;
    }
    
    /**
     * Set method for instanced objects of class Date
     * 
     * @param       day         Integer day of date to be stored
     */
    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Please use a value between 1 and 31 for day.");
        }
        this.day = day;
    }
    
    /**
     * Get method for instanced objects of class Date
     * 
     * @return      year        Integer year of date to be stored
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Get method for instanced objects of class Date
     * 
     * @return      month       Integer month of date to be stored
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * Get method for instanced objects of class Date
     * 
     * @return      day         Integer day of date to be stored
     */
    public int getDay() {
        return day;
    }
    
    /**
     * ToString method for instanced objects of class Date
     * 
     * @return      toString    String toString of date displayed in standard
     *                          US format MM/DD/YYYY
     */
    public String toString() {
        String toString = "" + month + "/" +  day + "/" + year;
        return toString;
    }
    
    /**
     * Equals method for instanced objects of class Date
     * 
     * @param       other       Instanced object other of Class Object, cast as a Date
     * 
     * @return      boolean     Returns false if dates do not equal each other
     *                          Returns true if dates equal each other
     */
    public boolean equals(Object other) {
    Date otherDate = (Date) other;
    return (this.year == otherDate.year &&
            this.month == otherDate.month &&
            this.day == otherDate.day);
    }
}

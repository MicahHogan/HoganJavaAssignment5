import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    private int year;
    private int month;
    private int day;

    /**
     * Constructor for objects of class Date
     */
    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear() {
        this.year = year;
    }
    
    public void setMonth() {
        this.month = month;
    }
    
    public void setDay() {
        this.day = day;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public String toString() {
        return "" + year + month + day;
    }
}

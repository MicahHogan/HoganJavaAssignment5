import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * WeatherDay constructs an instanced object of Class weatherDay with Date date,
 * integer tempHigh, double tempAvg, integer tempLow, double humidityAvg, double windAvg,
 * and double precipitation passed as parameters.  WeatherDay throws an
 * IllegalArgumentException in the case it is passed a null object reference as a date.
 *
 * @author Micah Hogan
 * @version 03/10/20
 */
public class WeatherDay
{
    private Date date;
    private int tempHigh;
    private double tempAvg;
    private int tempLow;
    private double humidityAvg;
    private double windAvg;
    private double precipitation;

    /**
     * Constructor for objects of class WeatherDay
     * 
     * @param       date            Date instanced object of class Date to be stored
     * @param       tempHigh        Integer high temperature to be stored
     * @param       tempAvg         Double average temperature to be stored
     * @param       tempLow         Integer low temperature to be stored
     * @param       humidityAvg     Double average humidity to be stored
     * @param       windAvg         Double average wind speed to be stored
     * @param       precipitation   Double total precipitation to be stored
     */
    public WeatherDay(Date date, int tempHigh, double tempAvg,
                      int tempLow, double humidityAvg, double windAvg,
                      double precipitation) {
        if (date == null) {
            throw new IllegalArgumentException("Please use a non-null value for date.");
        }
        this.date = date;
        this.tempHigh = tempHigh;
        this.tempAvg = tempAvg;
        this.tempLow = tempLow;
        this.humidityAvg = humidityAvg;
        this.windAvg = windAvg;
        this.precipitation = precipitation;
    }

    /**
     * Get method for instanced objects of Class weatherDay
     * 
     * @return      Date            Date instanced object of Class date to be stored
     */
    public Date getDate() {
        return this.date;
    }
    
    /**
     * Get method for instanced objects of Class weatherDay
     * 
     * @return      tempHigh        Integer high temperature to be stored
     */
    public int getTempHigh() {
        return tempHigh;
    }
    
    /**
     * Get method for instanced objects of Class weatherDay
     * 
     * @return     tempAvg          Double average temperature to be stored
     */
    public double getTempAvg() {
        return tempAvg;
    }
    
    /**
     * Get method for instanced objects of Class weatherDay
     * 
     * @return      tempLow         Integer low temperature to be stored
     */
    public int getTempLow() {
        return tempLow;
    }
    
    /**
     * Get method for instanced objects of Class weatherDay
     * 
     * @return      humidityAvg     Double average humidity percentage to be stored
     */
    public double getHumidityAvg() {
        return humidityAvg;
    }
    
    /**
     * Get method for instanced objects of Class weatherDay
     * 
     * @return      windAvg         Double average wind speed to be stored
     */
    public double getWindAvg() {
        return windAvg;
    }
    
    /**
     * Get method for instanced objects of Class weatherDay
     * 
     * @return      precipitation   Double total precipitation to be stored
     */
    public double getPrecipitation() {
        return precipitation;
    }
    
    /**
     * ToString method for instanced objects of Class weatherDay
     * 
     * @return      toString        String formatted with one piece of data per line
     */
    public String toString() {
        return "Date: " + date.toString() + "\n"
        + "High Temperature: " + tempHigh + " degrees Fahrenheit" + "\n"
        + "Low Temperature: " + tempLow + " degrees Fahrenheit" + "\n"
        + "Humidity Average: " + humidityAvg + "%" + "\n"
        + "Windspeed Average: " + windAvg + " miles per hour" + "\n"
        + "Total Precipitation: " + precipitation + " inches" + "\n";     
    }
}

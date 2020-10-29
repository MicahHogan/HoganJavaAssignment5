import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * Write a description of class WeatherDay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherDay
{
    public Date date;
    private int tempHigh;
    private double tempAvg;
    private int tempLow;
    private double humidityAvg;
    private double windAvg;
    private double precipitation;

    /**
     * Constructor for objects of class WeatherDay
     */
    public WeatherDay(Date date) {
        // initialise instance variables
        this.date = date;
        this.tempHigh = 0;
        this.tempAvg = 0.0;
        this.tempLow = 0;
        this.humidityAvg = 0.0;
        this.windAvg = 0.0;
        this.precipitation = 0.0;
    }

    
    public Date getDate() {
        return this.date;
    }
    
    public int getTempHigh() {
        return tempHigh;
    }
    
    public double getTempAvg() {
        return tempAvg;
    }
    
    public int getTempLow() {
        return tempLow;
    }
    
    public double getHumidityAvg() {
        return humidityAvg;
    }
    
    public double getWindAvg() {
        return windAvg;
    }
    
    public double getPrecipitation() {
        return precipitation;
    }
    
    public String toString() {
        return "" + date; 
    
    }
}

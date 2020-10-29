import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * Write a description of class WeatherManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherManager
{
   private int weatherDayCount;
   private int weatherDayA;
   private WeatherDay weatherDay;
   private double avgHighTemp;
   private double avgLowTemp;
   private double rainTotal;
   private int rainiestMonth;
   private DateRange longestWarmingTrend;
    
   public WeatherManager(File weatherFile) throws FileNotFoundException {
        Scanner fileReader = new Scanner(weatherFile);
        int lineCount = Integer.parseInt(fileReader.nextLine());
        fileReader.nextLine();
        
        String thisLine = "";
        
        WeatherDay [] weatherDayArray = new WeatherDay[lineCount];
        for(int row = 0; row < weatherDayArray.length - 1; row++) {
            thisLine = fileReader.nextLine();
            String [] lineSplit = thisLine.split(",");
        
        
            Date date = new Date(Integer.parseInt(lineSplit[0]), Integer.parseInt(lineSplit[1]),
            Integer.parseInt(lineSplit[2]));
        }
       
                
    }
    
    public int getWeatherDayCount() {
        return weatherDayCount;
    }
    
    public WeatherDay getWeatherDay(int index) {
        return weatherDay;
    }
    
    public int findWeatherDay(Date date) {
        return weatherDayA;
    }
    
    public double calcAvgHighTemp(int year, int month) {
        return avgHighTemp;
    }
    
    public double calcAvgLowTemp(int year, int month) {
        return avgLowTemp;
    }
    
    public double calcRainToatal(int year, int month) {
        return rainTotal;
    }
    
    public int calcRainiestMonth(int year) {
        return rainiestMonth;
    }
    
    public DateRange calcLongestWarmingTrend(int year) {
        return longestWarmingTrend;
    }
    
    public String toString() {
        return "";
    }
}

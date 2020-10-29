import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * WeatherManager constructs an instanced object of Class weatherManager,
 * which creates an array of instanced objects of Class weatherDay,
 * which are composed of instanced objects of Class date and integer
 * and double values.  WeatherManager provides methods to return the number
 * of weatherDays stored in the array, to return a weatherDay after passing it an
 * index number, and to return an index number after passing it a date.  WeatherManager
 * can calculate the average high temperature, OR average low temperature,
 * OR total precipitation after being passed the year and month.  WeatherManager
 * can calculate and return the rainiest month OR the longest period of time in which
 * the average high temperature for the day increased, in days.
 * 
 *
 * @author Micah Hogan
 * @version 03/10/20
 */
public class WeatherManager
{
    private WeatherDay[] weatherDays;
    
    public WeatherManager(File weatherFile) throws FileNotFoundException {
        Scanner fileReader = new Scanner(weatherFile);
        int lineCount = Integer.parseInt(fileReader.nextLine());
        weatherDays = new WeatherDay[lineCount];
        fileReader.nextLine();       
        String thisLine = "";
        
        for (int row = 0; row < weatherDays.length ; row++) {
            thisLine = fileReader.nextLine();
            String [] lineSplit = thisLine.split(",");
            Date date = new Date(Integer.parseInt(lineSplit[0]),
                        Integer.parseInt(lineSplit[1]),
                        Integer.parseInt(lineSplit[2]));
            
            WeatherDay weatherDay = new WeatherDay(date,
                                    Integer.parseInt(lineSplit[3]),
                                    Double.parseDouble(lineSplit[4]),
                                    Integer.parseInt(lineSplit[5]),
                                    Double.parseDouble(lineSplit[10]),
                                    Double.parseDouble(lineSplit[13]),
                                    Double.parseDouble(lineSplit[18]));
                                    
            weatherDays[row] = weatherDay;
        }
               
    }
    /**
     * Get method for instanced objects of Class weatherManager
     * 
     * @return      arrayLength     Integer arrayLength, length of the array
     */
    public int getWeatherDayCount() {
        int arrayLength = weatherDays.length;
        return arrayLength;
    }
    
    /**
     * Get method for instanced objects of Class weatherManager
     * 
     * @param       index           Integer index of instanced object of Class weatherDay
     *                              to be found
     * 
     * @return      thisWeatherDay  WeatherDay instanced object of Class weatherDay
     */
    public WeatherDay getWeatherDay(int index) {
        WeatherDay thisWeatherDay = weatherDays[index];
        return thisWeatherDay;
    }
    
    /**
     * Find weather day method for instanced objects of Class weatherManager
     * 
     * @param       date            Date instanced object of Class date to be found
     * 
     * @return      thisWdIdx       Integer index of instanced object of Class
     *                              weatherDay to be found
     */
    public int findWeatherDay(Date date) {        
        
        for (int wdIdx = 0; wdIdx < weatherDays.length &&
            weatherDays[wdIdx].getDate().getYear() <=
            date.getYear(); wdIdx++) {
            if (weatherDays[wdIdx].getDate().equals(date)) {          
                return wdIdx;
            }
        }
        return -1;       
    }
    
    /**
     * Calculate average high temperature method for instanced objects of Class
     * weatherManager
     * 
     * @param       year            Integer year of average high temperature to be found
     * @param       month           Integer month of average high temperature to be found
     * 
     * @return      avgHighTemp     Double average high temperature
     */
    public double calcAvgHighTemp(int year, int month) {       
        double dayCounter = 0.0;
        double highTempCounter = 0.0;
        double thisHighTemp = 0.0;
        double avgHighTemp = 0.0;
        
        for (int wdIdx = 0; wdIdx < weatherDays.length &&
            weatherDays[wdIdx].getDate().getYear() <= year; wdIdx++) {
            
            if (weatherDays[wdIdx].getDate().getMonth() == (month) &&
                    weatherDays[wdIdx].getDate().getYear() == (year)) {
                      thisHighTemp = weatherDays[wdIdx].getTempHigh();
                      highTempCounter += thisHighTemp;
                      dayCounter++;
                    }                    
            
        }
        avgHighTemp = highTempCounter/dayCounter;           
        return avgHighTemp;
        
    }
    
    /**
     * Calculate average low temperature method for instanced objects of Class
     * weatherManager
     * 
     * @param       year            Integer year of average low temperature to be found
     * @param       month           Integer month of average low temperature to be found
     * 
     * @return      avgLowTemp      Double average low temperature
     */
    public double calcAvgLowTemp(int year, int month) {
        if (year < 0) {
            throw new IllegalArgumentException("Please use a non-negative value for year.");
        }
        
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Please use a value between one and twelve for month.");
        }
        
        double dayCounter = 0.0;
        double lowTempCounter = 0.0;
        double thisLowTemp = 0.0;
        double avgLowTemp = 0.0;
        
        for (int wdIdx = 0; wdIdx < weatherDays.length &&
            weatherDays[wdIdx].getDate().getYear() <= year; wdIdx++) {
            
            if (weatherDays[wdIdx].getDate().getMonth() == (month) &&
                    weatherDays[wdIdx].getDate().getYear() == (year)) {
                      thisLowTemp = weatherDays[wdIdx].getTempLow();
                      lowTempCounter += thisLowTemp;
                      dayCounter++;
            }                   
            
        }
        avgLowTemp = lowTempCounter/dayCounter;
        return avgLowTemp;        
    }
    
    /**
     * Calculate rain total method for instanced objects of Class weatherManager
     * 
     * @param       year            Integer year of total precipitation to be found
     * @param       month           Integer month of total precipitation to be found
     * 
     * @return      rainMonthTotal  Double rainMonthTotal, total precipitation of month
     *                              and year passed as parameters
     */
    public double calcRainTotal(int year, int month) {        
        double thisRainDay = 0.0;
        double rainMonthTotal = 0.0;
        
        for (int wdIdx = 0; wdIdx < weatherDays.length; wdIdx++) {
            
            if (weatherDays[wdIdx].getDate().getMonth() == (month) &&
                    weatherDays[wdIdx].getDate().getYear() == (year)) {
                      thisRainDay = weatherDays[wdIdx].getPrecipitation();
                      rainMonthTotal += thisRainDay;
                      
            }
        
        }
        
        return rainMonthTotal;
    }
    
    /**
     * Calculate rainiest month method for instanced objects of Class weatherManager
     * 
     * @param       year            Integer year of rainiest month to be found
     * 
     * @return      rainiestMonth   Integer rainiestMonth, month with highest total
     *                              precipitationi of year passed as parameter
     */
    public int calcRainiestMonth(int year) {
        
        double rainMonthTotal = 0.0;
        double currentRainiestMonthTotal = 0.0;
        int rainiestMonth = 0;
        int monthsInYear = 12;
        
        for (int month = 1; month <= monthsInYear; month++) {
            rainMonthTotal = calcRainTotal(year, month);
            
            if (rainMonthTotal > currentRainiestMonthTotal) {
                currentRainiestMonthTotal = rainMonthTotal;
                rainiestMonth = month;
            
            }
            
        }

        return rainiestMonth;
        
    }
    
    /**
     * Find first index of year method for instanced objects of Class weatherManager
     * 
     * @param       year            Integer year of first index to be found
     * 
     * @return      startIdx        Integer startIdx, first index (Jan. 1st) of year
     *                              passed as parameter, returns -1 if year not found
     */
    public int findFirstIndexOfYear (int year) {
        
        for (int startIdx = 0; startIdx < weatherDays.length &&
            weatherDays[startIdx].getDate().getYear() <= year; startIdx++) {
                
            if (weatherDays[startIdx].getDate().getYear() == year) {
            return startIdx;        
            }
            
        }
        
        
        return -1;
    }
    
    /**
     * Calculate longest warming trend method for instanced objects
     * of Class weatherManager
     * 
     * @param       year            Integer year in which longest
     *                              warming trend is to be found
     * 
     * @return      trend           DateRange trend containing start
     *                              and end of longest warming trend
     */
    public DateRange calcLongestWarmingTrend(int year) {
        int longestTrend = 1;
        int trendCounter = 1;
        int startIdx = findFirstIndexOfYear(year);
        int endIndex = startIdx;
        
        if (startIdx == -1) {        
            return null;
        }
        
        for (int wdIdx = startIdx + 1; wdIdx < weatherDays.length &&
            weatherDays[wdIdx].getDate().getYear() == year; wdIdx++) {
            if (weatherDays[wdIdx - 1].getTempHigh() < weatherDays[wdIdx].getTempHigh()) {
                trendCounter++;
                if (trendCounter > longestTrend) {
                    longestTrend = trendCounter;
                    endIndex = wdIdx;
                }
            } else {
                trendCounter = 1;
            }
        
        }
        
        Date start = weatherDays[endIndex - longestTrend + 1].getDate();
        Date end = weatherDays[endIndex].getDate();
        
        DateRange trend = new DateRange(start, end);
        
        return trend;
    }
    
    /**
     * ToString method for instanced objects of Class weatherManager
     * 
     * @return      toString            String toString containing all
     *                                  weatherDay object info for each
     *                                  element in the array formatted
     *                                  in an easy to read manner.
     */
    public String toString() {
        String toString = "";
        
        for (int wdIdx = 0; wdIdx < weatherDays.length; wdIdx++) {
            toString += weatherDays[wdIdx].toString() + "\n";
        }
        
        return toString;
        
    }    

}

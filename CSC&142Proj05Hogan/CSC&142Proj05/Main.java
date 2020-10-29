import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * Main demonstrates and tests the capabilities of our Weather Manager program
 * by constructing several weather managers using files
 * with the longest warming trend at either the
 * beginning, the end, or in the middle of the file, and calling our
 * calcLongestWarmingTrend method from each weather manager, 
 * to ensure that the algorithm correctly finds the longest warming trend in each case.
 * Main also demonstrates the functionality of our calcAvgHighTemp, calcAvgLowTemp,
 * calcRainTotal, and calcRainiestMonth methods.
 *
 * @author Micah Hogan
 * @version 03/10/20
 */
public class Main
{
    public static void main(String[] args) throws FileNotFoundException {       
        File weatherFile = new File("SeattleWeather.txt");
        WeatherManager thisWeatherManager = new WeatherManager(weatherFile);
        weatherFile = new File("AnotherSeattleWeather.txt");
        WeatherManager anotherWeatherManager = new WeatherManager(weatherFile);
        weatherFile = new File("YetAnotherSeattleWeather.txt");       
        WeatherManager yetAnotherWeatherManager = new WeatherManager(weatherFile);
        Date date = new Date(2019, 2, 2);
        Date notInIndex = new Date(2022, 1, 13);
        System.out.println(date);
        System.out.println(thisWeatherManager.findWeatherDay(date));
        System.out.println(notInIndex);
        System.out.println(thisWeatherManager.findWeatherDay(notInIndex));
        System.out.println(thisWeatherManager.findFirstIndexOfYear(2018));
        System.out.println(thisWeatherManager.findFirstIndexOfYear(2019));
        System.out.println(thisWeatherManager.toString());    
        System.out.println(thisWeatherManager.calcLongestWarmingTrend(2019));
        System.out.println(thisWeatherManager.calcLongestWarmingTrend(2018));
        System.out.println(anotherWeatherManager.calcLongestWarmingTrend(2019));
        System.out.println(anotherWeatherManager.calcLongestWarmingTrend(2018));
        System.out.println(yetAnotherWeatherManager.calcLongestWarmingTrend(2019));
        System.out.println(yetAnotherWeatherManager.calcLongestWarmingTrend(2018));
        System.out.println(thisWeatherManager.calcAvgHighTemp(2019, 2));
        System.out.println(thisWeatherManager.calcAvgHighTemp(2022, 2));
        System.out.println(thisWeatherManager.calcAvgLowTemp(2019, 2));
        System.out.println(thisWeatherManager.calcAvgLowTemp(2022, 2));
        System.out.println(thisWeatherManager.calcRainTotal(2018,1));
        System.out.println(thisWeatherManager.calcRainTotal(2018,2));
        System.out.println(thisWeatherManager.calcRainTotal(2018,3));
        System.out.println(thisWeatherManager.calcRainTotal(2018,4));
        System.out.println(thisWeatherManager.calcRainTotal(2018,5));
        System.out.println(thisWeatherManager.calcRainTotal(2018,6));
        System.out.println(thisWeatherManager.calcRainTotal(2018,7));
        System.out.println(thisWeatherManager.calcRainTotal(2018,8));
        System.out.println(thisWeatherManager.calcRainTotal(2018,9));
        System.out.println(thisWeatherManager.calcRainTotal(2018,10));
        System.out.println(thisWeatherManager.calcRainTotal(2018,11));
        System.out.println(thisWeatherManager.calcRainTotal(2018,12));
        System.out.println(thisWeatherManager.calcRainiestMonth(2018));
        System.out.println(thisWeatherManager.calcRainTotal(2019,1));
        System.out.println(thisWeatherManager.calcRainTotal(2019,2));
        System.out.println(thisWeatherManager.calcRainiestMonth(2019));
        
        for (int wdIdx = 0; wdIdx < thisWeatherManager.getWeatherDayCount(); wdIdx++) {
            System.out.println(thisWeatherManager.getWeatherDay(wdIdx).toString());
            System.out.println();           
        }
        
    }
}

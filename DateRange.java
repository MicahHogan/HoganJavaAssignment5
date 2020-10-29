import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * DateRange constructs an instanced object of Class dateRange with
 * Date start and Date end passed as parameters.  DateRange throws an IllegalArgumentException
 * in the case it is passed a null object reference as a parameter.
 *
 * @author Micah Hogan
 * @version 03/10/20
 */
public class DateRange
{
    private Date start;
    private Date end;

    /**
     * Constructor for objects of class DateRange
     * 
     * @param       start       Start date of dateRange stored as instanced object of Class date
     * @param       end         End date of dateRange stored as instanced object of Class date
     */
    public DateRange(Date start, Date end) {
        setStart(start);
        setEnd(end);
    }
    
    /**
     * Set method for Date start of instanced object of Class dateRange
     * 
     * @param       start       Start date of dateRange stored as instanced object of Class date
     */
    public void setStart(Date start) {
        if (start == null) {
            throw new IllegalArgumentException("Please use a non-null value for start date.");
        }
        this.start = start;
    }
    
    /**
     * Set method for Date end of instanced object of Class dateRange
     * 
     * @param       end         End date of dateRange stored as instanced object of Class date
     */
    public void setEnd(Date end) {
        if (end == null) {
            throw new IllegalArgumentException("Please use a non-null value for end date.");
        }
        this.end = end;
    }
    
    /**
     * Get method for Date start of instanced object of Class dateRange
     * 
     * @return      start       Start date of dateRange stored as instanced object of Class date
     */
    public Date getStart() {
       return start;
    }
    
    /**
     * Get method for Date end of instanced object of Class dateRange
     * 
     * @param       end         End date of dateRange stored as instanced object of Class date
     */
    public Date getEnd() {
        return end;
    }
    
    /**
     * ToString method of instanced object of Class dateRange
     * 
     * @return      String     String text of instanced object of Class dateRange
     *                         expressed in MM/DD/YYYY - MM/DD/YYYY format
     */
    public String toString() {
        return start.toString() + " - " + end.toString();
    }
}

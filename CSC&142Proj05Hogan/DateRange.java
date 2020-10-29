import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
/**
 * Write a description of class DateRange here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DateRange
{
    private Date start;
    private Date end;

    /**
     * Constructor for objects of class DateRange
     */
    public DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    
    public void setStart() {
        this.start = start;
    }
    
    public void setEnd() {
        this.end = end;
    }

    public Date getStart() {
       return start;
    }
    
    public Date getEnd() {
        return end;
    }
    
    public String toString() {
        return "" + start + end;
    }
}
